package com.example.dirio.view.viewHolder

import android.view.View
import android.view.View.OnLongClickListener
import androidx.recyclerview.widget.RecyclerView
import com.example.dirio.Repository.DailyEntitie
import com.example.dirio.databinding.RowDailyBinding
import com.example.dirio.listener.ListenerFragment
import java.time.format.DateTimeFormatter

class DiariesViewHolder(private val bind: RowDailyBinding, val listener: ListenerFragment) :
    RecyclerView.ViewHolder(bind.root) {

    fun bind(daily: DailyEntitie) {

        bind.tyextTitulo.text = daily.title

        bind.linerRowDaily.setOnClickListener {
            listener.editDaily(daily.id)
        }

        bind.linerRowDaily.setOnLongClickListener {
            listener.deleteDaiyl(daily)
            true
        }

    }


}