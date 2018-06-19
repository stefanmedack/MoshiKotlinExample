package de.stefanmedack.model

import com.squareup.moshi.JsonAdapter
import de.stefanmedack.MoshiBuilder
import de.stefanmedack.exampledata.BaseExampleData.imageInstance
import de.stefanmedack.exampledata.BaseExampleData.imageJson
import org.amshove.kluent.shouldEqual
import org.junit.Before
import org.junit.Test

class ImageJsonTest {

    lateinit var adapter: JsonAdapter<Image>

    @Before
    fun setUp() {
        val moshi = MoshiBuilder.moshiInstance
        adapter = moshi.adapter(Image::class.java)
    }

    @Test
    fun `Parse json to Image`() {
        adapter.fromJson(imageJson) shouldEqual imageInstance
    }

}
