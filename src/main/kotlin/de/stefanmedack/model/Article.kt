package de.stefanmedack.model

import com.squareup.moshi.Json
import java.util.*

data class Article(
        val id: String,
        val title: String,
        @Json(name = "cell_image") val image: Image,
        val author: User,
        val video: Video? = null,
        val subtitle: String = "",
        val content: List<Content> = listOf(),
        @Json(name = "like_count") val likeCount: Int = 0,
        @Json(name = "published_at") val publishedAt: Date = Date(0)
)