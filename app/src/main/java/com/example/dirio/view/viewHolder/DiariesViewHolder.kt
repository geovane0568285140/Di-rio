package com.example.dirio.view.viewHolder

import android.app.AlertDialog
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.dirio.Repository.DailyEntitie
import com.example.dirio.databinding.RowDailyBinding
import com.example.dirio.listener.ListenerFragment



class DiariesViewHolder(private val bind: RowDailyBinding, val listener: ListenerFragment) :
    RecyclerView.ViewHolder(bind.root) {

    fun bind(daily: DailyEntitie) {

        bind.tyextTitulo.text = daily.title

        bind.linerRowDaily.setOnClickListener {
            listener.editDaily(daily.id)
        }

        bind.linerRowDaily.setOnLongClickListener {
            val builder = AlertDialog.Builder(itemView.context)
            builder.setMessage("Tem certeza que deseja deleter esta anotação?")
                .setPositiveButton("Sim") { dialog, which ->
                    listener.deleteDaiyl(daily)
                }
            builder.setNegativeButton("Não") { dialog, which ->
                dialog.cancel()
            }
            builder.create().show()
            Toast.makeText(itemView.context, "Pagina Deletada", Toast.LENGTH_SHORT).show()
            true
        }

    }


}