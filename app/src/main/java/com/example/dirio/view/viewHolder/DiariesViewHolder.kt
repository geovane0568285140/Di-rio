package com.example.dirio.view.viewHolder

import androidx.recyclerview.widget.RecyclerView
import com.example.dirio.databinding.RowDailyBinding

class DiariesViewHolder(private val bind: RowDailyBinding) : RecyclerView.ViewHolder(bind.root) {

    fun bind(list: String){
        val txt = list

        bind.textTitulo.text = txt
    }


}