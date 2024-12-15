package com.example.dirio.listener

import com.example.dirio.Repository.DailyEntitie

interface ListenerFragment {

    fun editDaily(id:Int)

    fun deleteDaiyl(daily: DailyEntitie)

}