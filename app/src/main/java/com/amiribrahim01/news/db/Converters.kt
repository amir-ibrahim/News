package com.amiribrahim01.news.db

import androidx.room.TypeConverter
import com.amiribrahim01.news.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}