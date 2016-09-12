package com.wada811.kotlinorma.data.adapter

import com.github.gfx.android.orma.annotation.StaticTypeAdapter
import org.threeten.bp.ZonedDateTime

@StaticTypeAdapter(targetType = ZonedDateTime::class, serializedType = String::class, serializer = "serialize", deserializer = "deserialize")
//@StaticTypeAdapter(targetType = ZonedDateTime::class, serializedType = String::class)
object ZonedDateTimeAdapter {

    @JvmStatic
    fun serialize(source: ZonedDateTime): String {
        return source.toString()
    }

    @JvmStatic
    fun deserialize(serialized: String): ZonedDateTime {
        return ZonedDateTime.parse(serialized)
    }
}
