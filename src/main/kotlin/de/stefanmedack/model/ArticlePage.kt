package de.stefanmedack.model

data class ArticlePage(
        val links: PageLinks = PageLinks(),
        val data: List<Article> = listOf()
)