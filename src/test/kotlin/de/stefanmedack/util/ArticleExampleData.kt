package de.stefanmedack.util

import de.stefanmedack.model.Article
import de.stefanmedack.model.ArticlePage
import de.stefanmedack.model.Content

// ********
// *** Article
// ********

val minimalArticleJson = """
{
    "id": "id",
    "title": "title",
    "cell_image": $imageJson,
    "author": $minimalAuthorJson
}
"""
val minimalArticleInstance = Article(
        id = "id",
        title = "title",
        image = imageInstance,
        author = minimalAuthorInstance
)

val minimalArticleContentJson = """
{
    "id": "id",
    "title": "title",
    "cell_image": $imageJson,
    "author": $minimalAuthorJson,
    "content": [
        { "content": "Content Text" },
        { "content": "Content Text" }
    ]
}
"""
val minimalArticleContentInstance = Article(
        id = "id",
        title = "title",
        image = imageInstance,
        author = minimalAuthorInstance,
        content = listOf(
                Content(content = "Content Text"),
                Content(content = "Content Text")
        )
)

val fullArticleJson = """
{
    "id": "id",
    "title": "Data classes and parsing JSON",
    "subtitle": "A story about converting Models to Kotlin",
    "cell_image": $imageJson,
    "author": $fullAuthorJson,
    "like_count": 42,
    "url": "url",
    "published_at": $exampleDateJson,
    "video": $videoJson,
    "content": [
        { "content": "Content Text" },
        { "content": "Content Text" }
    ]
}
"""
val fullArticleInstance = Article(
        id = "id",
        title = "Data classes and parsing JSON",
        subtitle = "A story about converting Models to Kotlin",
        image = imageInstance,
        author = fullAuthorInstance,
        likeCount = 42,
        publishedAt = exampleDateInstance,
        video = videoInstance,
        content = listOf(
                Content(content = "Content Text"),
                Content(content = "Content Text")
        )
)

// ********
// *** ArticlePage
// ********

val minimalArticlePageJson = """
{
    "data": [
        $minimalArticleJson
    ]
}
"""
val minimalArticlePageInstance = ArticlePage(data = listOf(minimalArticleInstance))

val fullArticlePageJson = """
{
    $linksJson,
    "data": [
        $minimalArticleContentJson,
        $fullArticleJson
    ]
}
"""
val fullArticlePageInstance = ArticlePage(links = linksInstance, data = listOf(minimalArticleContentInstance, fullArticleInstance))
