package de.stefanmedack

import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.Rfc3339DateJsonAdapter
import de.stefanmedack.adapter.DefaultOnDataMismatchAdapter
import de.stefanmedack.adapter.FilterNullValuesFromListAdapter
import de.stefanmedack.model.Article
import java.util.*

object MoshiBuilder {
    val moshiInstance: Moshi
        get() = Moshi.Builder()
                .add(Date::class.java, Rfc3339DateJsonAdapter().nullSafe())

                .add(DefaultOnDataMismatchAdapter.newFactory(Article::class.java, null))

                .add(FilterNullValuesFromListAdapter.newFactory(Article::class.java))

                .add(KotlinJsonAdapterFactory())
                .build()
}
