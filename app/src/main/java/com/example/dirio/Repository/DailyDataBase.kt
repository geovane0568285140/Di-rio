package com.example.dirio.Repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.dirio.constants.Constants


@Database(entities = [DailyEntitie::class], version = 1)
@TypeConverters(Converters::class)
abstract class DailyDataBase: RoomDatabase() {

    abstract fun dailyDAO(): DailyDAO

    companion object {

        private lateinit var INSTANCE: DailyDataBase
        fun getDataBAse(context: Context):DailyDataBase {
            if (!::INSTANCE.isInitialized){
                synchronized(DailyEntitie::class.java){
                 INSTANCE = Room.databaseBuilder(context, DailyDataBase::class.java, Constants.DataBase.namedb_daily)
                     .allowMainThreadQueries()
                     .build()
                }
            }
            return INSTANCE
        }

    }

}