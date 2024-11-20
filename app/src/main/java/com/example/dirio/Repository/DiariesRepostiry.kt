package com.example.dirio.Repository



class DiariesRepostiry(context: android.content.Context){

    private val repository = DailyDataBase.getDataBAse(context).dailyDAO()

    fun getALL(): List<DailyEntitie>{
        return repository.getALL()
    }

    fun getDailey(id: Int): DailyEntitie? {
        return repository.getDaily(id)
    }


    fun insert(daily: DailyEntitie): Boolean {
        return repository.insert(daily) > 0
    }
}