package com.example.dirio.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dirio.Repository.DailyEntitie
import com.example.dirio.databinding.RowDailyBinding
import com.example.dirio.view.viewHolder.DiariesViewHolder

class DiariesAdapter: RecyclerView.Adapter<DiariesViewHolder>() {

    private var listDiaries: List<DailyEntitie> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiariesViewHolder {
        val item = RowDailyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DiariesViewHolder(item)
    }

    override fun onBindViewHolder(holder: DiariesViewHolder, position: Int) {
        holder.bind(listDiaries[position])
    }

    override fun getItemCount(): Int {
        return listDiaries.count()
    }

    fun update(list: List<DailyEntitie>){
        listDiaries = list
    }

}