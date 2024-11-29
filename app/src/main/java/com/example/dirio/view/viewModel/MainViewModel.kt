package com.example.dirio.view.viewModel


import android.graphics.drawable.Drawable
import androidx.core.graphics.drawable.toDrawable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.dirio.R


class MainViewModel: ViewModel() {

    private val _drawable = MutableLiveData<Int>()
    val drawable: LiveData<Int> = _drawable

    fun startFragment(nav: NavController): Int{
        nav.addOnDestinationChangedListener { controller, destination, arguments ->
            when(destination.id){
                R.id.DiariesFragment -> {
                    _drawable.value = R.drawable.baseline_add_24
//                    nav.navigate(R.id.SecondFragment)
                }
                R.id.SecondFragment -> {
//                    nav.navigate(R.id.DiariesFragment)
                    _drawable.value = R.drawable.baseline_add_task_24
                }
            }
        }
    }


}