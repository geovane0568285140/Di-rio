package com.example.dirio.Repository

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity
data class DailyEntitie (

    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "Title")
    val title: String,

    @ColumnInfo(name = "text")
    val text: String,

    @ColumnInfo(name = "dateTime")
    val dateTime: LocalDateTime

)

