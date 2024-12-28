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

    private val _drawable = MutableLiveData<Int>()
    val drawable: LiveData<Int> = _drawable
    private val _fragmentId = MutableLiveData<Int>()
    val fragmentId: LiveData<Int> = _fragmentId

    fun startFragment(nav: NavController) {
//        _fragmentId.value = nav.currentDestination?.id ?: 0
        when (nav.currentDestination?.id) {
            R.id.DiariesFragment -> {
                _drawable.value = R.drawable.baseline_add_task_24
                nav.navigate(R.id.EditFragment)
            }

            R.id.EditFragment -> {
                _drawable.value = R.drawable.baseline_add_24
                nav.navigate(R.id.DiariesFragment)
            }
        }
    }

    fun alertDialog(context: Context): AlertDialog? {
        val builder = AlertDialog.Builder(context)
        builder.setMessage(R.string.on)
            .setNegativeButton("Fechar") {dialog, id ->
                dialog.cancel()
            }
        return builder.create()
    }


}