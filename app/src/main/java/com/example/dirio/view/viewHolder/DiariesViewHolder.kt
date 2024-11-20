package com.example.dirio.view.viewHolder

import androidx.recyclerview.widget.RecyclerView
import com.example.dirio.Repository.DailyEntitie
import com.example.dirio.databinding.RowDailyBinding

class DiariesViewHolder(private val bind: RowDailyBinding) : RecyclerView.ViewHolder(bind.root) {

    fun bind(daily: DailyEntitie) {

        bind.textTitulo.text = daily.title
    }


}