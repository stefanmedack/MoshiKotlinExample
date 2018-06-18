package de.stefanmedack

import de.stefanmedack.exampledata.minimalArticleJson
import de.stefanmedack.model.Article

fun main(args: Array<String>) {
    printArticle()
}

private fun printArticle() {
    val adapter = MoshiBuilder.moshiInstance.adapter(Article::class.java)

    val article = adapter.fromJson(minimalArticleJson)

    println(adapter.toJson(article))
}