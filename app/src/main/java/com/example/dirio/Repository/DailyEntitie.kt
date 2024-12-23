package com.example.dirio.Repository

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dirio.constants.Constants
import java.time.LocalDateTime

private val namesColumn = Constants.DataBase.Table.ColumnName_Daily

@Entity(tableName = Constants.DataBase.Table.nameTable_Daily)
data class DailyEntitie (

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    @ColumnInfo(name = namesColumn.title)
    val title: String,

    @ColumnInfo(name = namesColumn.text)
    val text: String,

    @ColumnInfo(name = namesColumn.dateTime)
    val dateTime: LocalDateTime

)

