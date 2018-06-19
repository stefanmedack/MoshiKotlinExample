package de.stefanmedack.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PageLinks(
        val next: String = ""
)