package com.example.dirio.listener

import android.app.Dialog
import com.example.dirio.Repository.DailyEntitie

interface ListenerFragment {

    fun editDaily(id:Int)

    fun deleteDaiyl(daily: DailyEntitie)

}