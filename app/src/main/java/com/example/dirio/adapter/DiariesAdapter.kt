package com.example.dirio.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dirio.databinding.RowDailyBinding
import com.example.dirio.view.viewHolder.DiariesViewHolder

class DiariesAdapter: RecyclerView.Adapter<DiariesViewHolder>() {

    private var listDiaries = listOf("")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiariesViewHolder {
        val bind = RowDailyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DiariesViewHolder(bind)
    }

    override fun getItemCount(): Int {
        return listDiaries.count()
    }

    override fun onBindViewHolder(holder: DiariesViewHolder, position: Int) {

    }
}