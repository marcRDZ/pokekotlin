package me.sargunvohra.lib.pokekotlin.util

import java.util.*

fun String.toCapital() = replaceFirstChar { firstChar ->
    if (firstChar.isLowerCase()) firstChar.titlecase(
        Locale.getDefault()
    ) else this
}