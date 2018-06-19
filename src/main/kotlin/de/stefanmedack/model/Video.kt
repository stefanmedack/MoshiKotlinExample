package de.stefanmedack.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Video(
        @Json(name = "video_url") val videoUrl: String,
        @Json(name = "preview_image") val previewImage: Image
)