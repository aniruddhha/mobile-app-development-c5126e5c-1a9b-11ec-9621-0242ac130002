package com.aniruddha.kudalkar.jetpackapps.anidemo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MyViewModel: ViewModel() {

    private val users : MutableLiveData<MutableList<AppUser>> = MutableLiveData()
    private val str : MutableLiveData<String> = MutableLiveData("")

    fun getUsers() : LiveData<MutableList<AppUser>>  = users

    fun getStr(): LiveData<String> = str

    fun onClick() {
        Log.i("@ani", "Clicned")
        users.value?.add(AppUser())
        str.value = Date().toString()
    }
}