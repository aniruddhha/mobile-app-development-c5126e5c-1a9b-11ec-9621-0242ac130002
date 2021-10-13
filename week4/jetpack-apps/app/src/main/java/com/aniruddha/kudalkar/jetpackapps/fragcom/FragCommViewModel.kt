package com.aniruddha.kudalkar.jetpackapps.fragcom

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragCommViewModel: ViewModel() {

    val color = MutableLiveData<String>()

    fun changeColor(col : String) {
        color.value = col
        Log.i("@ani", "Color is $col")
    }
}