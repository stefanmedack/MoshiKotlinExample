package de.stefanmedack.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ArticlePage(
        val links: PageLinks = PageLinks(),
        val data: List<Article> = listOf()
)