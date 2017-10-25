package com.ajnsnewmedia.kitchenstories.ultron.model.article

import com.squareup.moshi.JsonAdapter
import de.stefanmedack.MoshiBuilder.moshiInstance
import de.stefanmedack.model.Article
import de.stefanmedack.util.*
import org.amshove.kluent.shouldBeNull
import org.amshove.kluent.shouldEqual
import org.junit.Before
import org.junit.Test

class ArticleJsonTest {

    lateinit var adapter: JsonAdapter<Article>

    @Before
    fun setUp() {
        val moshi = moshiInstance
        adapter = moshi.adapter(Article::class.java)
    }

    @Test
    fun `Parse empty json to Article`() {
        adapter.fromJson("{}").shouldBeNull()
    }

    @Test
    fun `Parse minimal valid json to Article`() {
        adapter.fromJson(minimalArticleJson) shouldEqual minimalArticleInstance
    }

    @Test
    fun `Parse minimal valid json with all minimal ContentModules to Article`() {
        adapter.fromJson(minimalArticleContentJson) shouldEqual minimalArticleContentInstance
    }

    @Test
    fun `Parse full valid json to Article`() {
        adapter.fromJson(fullArticleJson) shouldEqual fullArticleInstance
    }
}