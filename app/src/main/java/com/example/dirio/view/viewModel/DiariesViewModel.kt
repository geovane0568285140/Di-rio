package com.example.dirio.view.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.dirio.Repository.DailyEntitie
import com.example.dirio.Repository.DiariesRepostiry
import java.time.LocalDateTime


class DiariesViewModel(application: Application) : AndroidViewModel(application) {

    private val repostiry = DiariesRepostiry(application.applicationContext)

    private val listaDaily = MutableLiveData<List<DailyEntitie>>()
    val observeListaDaily: LiveData<List<DailyEntitie>> = listaDaily

    fun getALL(){


//        val time: LocalDateTime = LocalDateTime.now()
//        val daily = DailyEntitie(0, "title", "text", time)
//        if (repostiry.insert(daily)){
//            Log.i("Insert", "true")
//        } else{
//            Log.i("Insert", "false")
//        }
        listaDaily.value = repostiry.getALL()
    }


}