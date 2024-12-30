package com.example.dirio.view.viewModel

import androidx.lifecycle.AndroidViewModel
import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.dirio.Repository.DailyEntitie
import com.example.dirio.Repository.DiariesRepostiry
import java.time.LocalDate
import java.time.LocalDateTime


class FragmentsViewModel(application: Application) : AndroidViewModel(application) {

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
        val pare = 0
    }

    fun insertDaily(dailyEntitie: DailyEntitie){
        repostiry.insert(dailyEntitie)
    }

    fun getDaily(id: Int): DailyEntitie {
        return repostiry.getDailey(id)!!
    }

    fun updateDaily(dailyEntitie: DailyEntitie){
        repostiry.update(dailyEntitie)
    }

    fun delete(dailyEntitie: DailyEntitie) {
        repostiry.delete(dailyEntitie)
    }

    fun getDateTimeUi(hour: Int, minute: Int): LocalDateTime {
        val currentDate = LocalDate.now()
        return LocalDateTime.of(
            currentDate.year,
            currentDate.month,
            currentDate.dayOfMonth,
            hour,
            minute
        )
    }

}