package de.stefanmedack.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Content(val content: String)