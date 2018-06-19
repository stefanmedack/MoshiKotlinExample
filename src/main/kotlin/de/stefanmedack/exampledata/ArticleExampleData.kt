package de.stefanmedack.exampledata

import de.stefanmedack.exampledata.BaseExampleData.exampleDateInstance
import de.stefanmedack.exampledata.BaseExampleData.exampleDateJson
import de.stefanmedack.exampledata.BaseExampleData.fullAuthorInstance
import de.stefanmedack.exampledata.BaseExampleData.fullAuthorJson
import de.stefanmedack.exampledata.BaseExampleData.imageInstance
import de.stefanmedack.exampledata.BaseExampleData.imageJson
import de.stefanmedack.exampledata.BaseExampleData.linksInstance
import de.stefanmedack.exampledata.BaseExampleData.linksJson
import de.stefanmedack.exampledata.BaseExampleData.minimalAuthorInstance
import de.stefanmedack.exampledata.BaseExampleData.minimalAuthorJson
import de.stefanmedack.exampledata.BaseExampleData.videoInstance
import de.stefanmedack.exampledata.BaseExampleData.videoJson
import de.stefanmedack.model.Article
import de.stefanmedack.model.ArticlePage
import de.stefanmedack.model.Content

object ArticleExampleData {

    // ********
    // *** Article
    // ********

    const val minimalArticleJson = """
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

    const val minimalArticleContentJson = """
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

    const val fullArticleJson = """
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

    const val minimalArticlePageJson = """
    {
        "data": [
            $minimalArticleJson
        ]
    }
    """
    val minimalArticlePageInstance = ArticlePage(data = listOf(minimalArticleInstance))

    const val fullArticlePageJson = """
    {
        $linksJson,
        "data": [
            $minimalArticleContentJson,
            $fullArticleJson
        ]
    }
    """
    val fullArticlePageInstance = ArticlePage(links = linksInstance, data = listOf(minimalArticleContentInstance, fullArticleInstance))

}