package com.example.dirio.view.viewModel

import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.dirio.R

class SharedViewModel: ViewModel() {

    private val _drawable = MutableLiveData<Int>()
    val drawable: LiveData<Int> = _drawable


    fun startFragment(nav: NavController, bundler: Bundle? = null) {
//        _fragmentId.value = nav.currentDestination?.id ?: 0
        when (nav.currentDestination?.id) {
            R.id.DiariesFragment -> {
                _drawable.value = R.drawable.baseline_add_task_24
                if (bundler != null)
                nav.navigate(R.id.EditFragment, bundler)
            }
            R.id.EditFragment -> {
                _drawable.value = R.drawable.baseline_add_24
                nav.navigate(R.id.DiariesFragment)
            }
        }
    }
}