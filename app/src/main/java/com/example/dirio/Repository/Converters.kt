package com.example.dirio.Repository


import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date


class Converters {

    private val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")


    @TypeConverter
    fun dataTime_String(date: LocalDateTime): String {
        return date.format(formatter)
    }

    @TypeConverter
    fun string_Datatime(dateTimeString: String): LocalDateTime{
        return LocalDateTime.parse(dateTimeString, formatter)
    }

}