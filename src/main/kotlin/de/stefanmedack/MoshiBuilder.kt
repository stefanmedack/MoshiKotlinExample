package de.stefanmedack

import com.ajnsnewmedia.kitchenstories.ultron.adapter.DefaultOnDataMismatchAdapter
import com.ajnsnewmedia.kitchenstories.ultron.adapter.FilterNullValuesFromListAdapter
import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.Rfc3339DateJsonAdapter
import de.stefanmedack.model.Article
import de.stefanmedack.model.Content
import java.util.*

object MoshiBuilder {
    val moshiInstance: Moshi
        get() = Moshi.Builder()
                .add(Date::class.java, Rfc3339DateJsonAdapter().nullSafe())

                .add(DefaultOnDataMismatchAdapter.newFactory(Article::class.java, null))

                // Article filter Adapter
                .add(FilterNullValuesFromListAdapter.newFactory(Article::class.java))
                .add(FilterNullValuesFromListAdapter.newFactory(Content::class.java))

                .add(KotlinJsonAdapterFactory())
                .build()
}
