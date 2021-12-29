package me.sargunvohra.lib.pokekotlin.model

sealed class PokeApiError

data class HttpError(val code: Int, val body: String) : PokeApiError()

data class NetworkError(val throwable: Throwable) : PokeApiError()

data class UnknownApiError(val throwable: Throwable) : PokeApiError()
