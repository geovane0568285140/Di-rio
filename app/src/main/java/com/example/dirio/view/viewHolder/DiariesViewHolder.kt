package com.example.dirio.view.viewHolder

import android.location.GnssAntennaInfo.Listener
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.dirio.Repository.Converters
import com.example.dirio.Repository.DailyEntitie
import com.example.dirio.databinding.RowDailyBinding
import com.example.dirio.listener.ListenerFragment
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DiariesViewHolder(private val bind: RowDailyBinding, val listener : ListenerFragment) : RecyclerView.ViewHolder(bind.root) {

    fun bind(daily: DailyEntitie) {

        bind.textTitulo.text = daily.title

        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

        bind.textDate.text = daily.dateTime.format(formatter)

        bind.linerRowDaily.setOnClickListener(View.OnClickListener {
            listener.editDaily(daily.id)
        })

    }


}