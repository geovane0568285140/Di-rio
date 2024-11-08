package com.example.dirio.Repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update

@Dao
interface DailyDAO {


    @Insert
    fun insert()

    @Update
    fun update()

    @Delete
    fun delete()

}