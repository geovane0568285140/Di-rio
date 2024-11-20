package com.example.dirio.view.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dirio.Repository.DailyEntitie
import com.example.dirio.Repository.DiariesRepostiry

class DiariesViewModel(application: Application) : AndroidViewModel(application) {

    private val repostiry = DiariesRepostiry(application.applicationContext)

    private val listaDaily = MutableLiveData<List<DailyEntitie>>()
    val observeListaDaily: LiveData<List<DailyEntitie>> = listaDaily

    fun getALL(){
         listaDaily.value = repostiry.getALL()
    }


}