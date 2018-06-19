package de.stefanmedack.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Image(
        val url: String,
        val source: String? = null
)