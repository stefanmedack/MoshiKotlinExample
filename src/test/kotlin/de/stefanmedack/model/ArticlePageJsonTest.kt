package com.ajnsnewmedia.kitchenstories.ultron.model.article

import com.squareup.moshi.JsonAdapter
import de.stefanmedack.MoshiBuilder.moshiInstance
import de.stefanmedack.model.ArticlePage
import de.stefanmedack.util.*
import org.amshove.kluent.shouldEqual
import org.junit.Before
import org.junit.Test

class ArticlePageJsonTest {

    lateinit var adapter: JsonAdapter<ArticlePage>

    @Before
    fun setUp() {
        val moshi = moshiInstance
        adapter = moshi.adapter(ArticlePage::class.java)
    }

    @Test
    fun `Parse empty json to ArticlePage`() {
        adapter.fromJson("{}") shouldEqual ArticlePage()
    }

    @Test
    fun `Parse minimal valid json to ArticlePage`() {
        adapter.fromJson(minimalArticlePageJson) shouldEqual minimalArticlePageInstance
    }

    @Test
    fun `Parse full valid json to ArticlePage`() {
        adapter.fromJson(fullArticlePageJson) shouldEqual fullArticlePageInstance
    }

    @Test
    fun `Parse json with broken articles to filtered ArticlePage`() {
        val data = adapter.fromJson("""{
            "data": [
                $minimalArticleJson,
                null,
                {},
                {"id": "only_id_is_set"},
                $minimalArticleContentJson
            ]
        }""")!!.data
        data.size shouldEqual 2
    }
}