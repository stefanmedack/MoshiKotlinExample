package de.stefanmedack.model

import com.squareup.moshi.Json

data class User(
        val id: String,
        val username: String,
        @Json(name = "user_image") val userImage: Image? = null
)