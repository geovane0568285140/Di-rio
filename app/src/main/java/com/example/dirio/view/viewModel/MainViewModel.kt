package com.example.dirio.view.viewModel


import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Application
import android.content.Context
import android.content.Intent
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.dirio.R
import com.example.dirio.Repository.DiariesRepostiry


class MainViewModel() : ViewModel() {

    fun alertDialog(context: Context): AlertDialog? {
        val builder = AlertDialog.Builder(context)
        builder.setMessage(R.string.on)
            .setNegativeButton("Fechar") {dialog, id ->
                dialog.cancel()
            }
        return builder.create()    }


}