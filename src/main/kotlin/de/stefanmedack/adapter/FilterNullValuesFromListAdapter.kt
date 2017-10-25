package com.ajnsnewmedia.kitchenstories.ultron.adapter

import com.squareup.moshi.*
import java.io.IOException
import java.lang.reflect.Type


class FilterNullValuesFromListAdapter<T : Any> private constructor(private val delegate: JsonAdapter<List<T?>>) : JsonAdapter<List<T>>() {

    @Throws(IOException::class)
    override fun fromJson(reader: JsonReader): List<T> =
            delegate.fromJsonValue(reader.readJsonValue())?.filterNotNull() ?: listOf()

    @Throws(IOException::class)
    override fun toJson(writer: JsonWriter, value: List<T>?) {
        delegate.toJson(writer, value)
    }

    companion object {
        @JvmStatic
        fun <T : Any> newFactory(type: Class<T>): JsonAdapter.Factory {
            return object : JsonAdapter.Factory {
                override fun create(requestedType: Type, annotations: Set<Annotation>, moshi: Moshi): JsonAdapter<*>? {
                    val listType = Types.newParameterizedType(List::class.java, type)
                    if (listType != requestedType) {
                        return null
                    }
                    val delegate = moshi.nextAdapter<List<T?>>(this, listType, annotations)
                    return FilterNullValuesFromListAdapter(delegate)
                }
            }
        }
    }
}
