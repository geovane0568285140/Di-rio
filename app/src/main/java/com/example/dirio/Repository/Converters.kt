package com.example.dirio.Repository


import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class Converters {

    private val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")

    @TypeConverter
    fun dataTime_String(date: LocalDateTime): String {
        return date.format(formatter)
    }

    @TypeConverter
    fun StringDatatime(dateString: String): LocalDateTime{
        return LocalDateTime.parse(dateString, formatter)
    }


}