package com.example.dirio.Repository

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface DailyDAO {

    @Insert
    fun insert(dailyEntitie: DailyEntitie): Long

    @Update
    fun update(dailyEntitie: DailyEntitie): Int

    @Delete
    fun delete(dailyEntitie: DailyEntitie)

    @Query("SELECT * FROM Daily")
    fun getALL(): List<DailyEntitie>

    @Query("SELECT * FROM Daily WHERE id = :id")
    fun getDaily(id: Int): DailyEntitie?
}