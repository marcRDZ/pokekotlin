package me.sargunvohra.lib.pokekotlin.util

import arrow.core.Either
import me.sargunvohra.lib.pokekotlin.model.HttpError
import me.sargunvohra.lib.pokekotlin.model.NetworkError
import me.sargunvohra.lib.pokekotlin.model.PokeApiError
import me.sargunvohra.lib.pokekotlin.model.UnknownApiError
import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import java.io.IOException
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

/**
 * Custom [CallAdapter.Factory] to handle Retrofit [Response] through [Either] type
 *
 * Original idea taken from:
 * https://proandroiddev.com/retrofit-calladapter-for-either-type-2145781e1c20
 */
internal class EitherCallAdapterFactory : CallAdapter.Factory() {

    override fun get(
        returnType: Type,
        annotations: Array<Annotation>,
        retrofit: Retrofit
    ): CallAdapter<*, *>? {
        if (getRawType(returnType) != Call::class.java) return null
        check(returnType is ParameterizedType) { "Return type must be a parameterized type." }

        val responseType = getParameterUpperBound(0, returnType)
        if (getRawType(responseType) != Either::class.java) return null
        check(responseType is ParameterizedType) { "Response type must be a parameterized type." }

        val leftType = getParameterUpperBound(0, responseType)
        if (getRawType(leftType) != PokeApiError::class.java) return null

        val rightType = getParameterUpperBound(1, responseType)
        return EitherCallAdapter<Any>(rightType)
    }
}

private class EitherCallAdapter<R>(
    private val successType: Type
) : CallAdapter<R, Call<Either<PokeApiError, R>>> {

    override fun adapt(call: Call<R>): Call<Either<PokeApiError, R>> = EitherCall(call, successType)

    override fun responseType(): Type = successType
}

class EitherCall<R>(
    private val delegate: Call<R>,
    private val successType: Type
) : Call<Either<PokeApiError, R>> {

    override fun enqueue(callback: Callback<Either<PokeApiError, R>>) = delegate.enqueue(
        object : Callback<R> {

            override fun onResponse(call: Call<R>, response: Response<R>) {
                callback.onResponse(this@EitherCall, Response.success(response.toEither()))
            }

            override fun onFailure(call: Call<R>, throwable: Throwable) {
                val error = when (throwable) {
                    is IOException -> NetworkError(throwable)
                    else -> UnknownApiError(throwable)
                }
                callback.onResponse(this@EitherCall, Response.success(Either.Left(error)))
            }
        }
    )

    override fun isExecuted(): Boolean = delegate.isExecuted

    override fun clone(): Call<Either<PokeApiError, R>> = EitherCall(delegate.clone(), successType)

    override fun isCanceled(): Boolean = delegate.isCanceled

    override fun cancel() = delegate.cancel()

    override fun execute(): Response<Either<PokeApiError, R>> =
        throw UnsupportedOperationException()

    override fun request(): Request = delegate.request()

    override fun timeout(): Timeout = delegate.timeout()

    private fun <R> Response<R>.toEither(): Either<PokeApiError, R> {
        // Http error response (4xx - 5xx)
        if (!isSuccessful) {
            val errorBody = errorBody()?.string() ?: ""
            return Either.Left(HttpError(code(), errorBody))
        }

        // Http success response with body
        body()?.let { body -> return Either.Right(body) }

        // if we defined Unit as success type it means we expected no response body
        // e.g. in case of 204 No Content
        return if (successType == Unit::class.java) {
            @Suppress("UNCHECKED_CAST")
            Either.Right(Unit) as Either<PokeApiError, R>
        } else {
            @Suppress("UNCHECKED_CAST")
            Either.Left(UnknownError("Response body was null")) as Either<PokeApiError, R>
        }
    }
}
