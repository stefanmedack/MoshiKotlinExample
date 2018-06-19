package de.stefanmedack.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class User(
        val id: String,
        val username: String,
        @Json(name = "user_image") val userImage: Image? = null
)