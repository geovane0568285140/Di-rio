package com.example.dirio.Repository

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context

@Database(entities = [DailyEntitie::class], version = 1)
abstract class DailyDataBase: RoomDatabase() {

    abstract fun dailyDAO(): DailyDAO

    companion object {

        private lateinit var INSTANCE: DailyDataBase

        fun getDataBAse(context: Context):DailyDataBase {
            if (!::INSTANCE.isInitialized){
                synchronized(DailyEntitie::class.java){
                 INSTANCE = Room.databaseBuilder(context, DailyDataBase::class.java, "database-Daily"
                 ).allowMainThreadQueries().build()
                }
            }
            return INSTANCE
        }

    }

}