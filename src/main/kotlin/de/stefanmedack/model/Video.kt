package de.stefanmedack.model

import com.squareup.moshi.Json

data class Video(
        @Json(name = "video_url") val videoUrl: String,
        @Json(name = "preview_image") val previewImage: Image
)