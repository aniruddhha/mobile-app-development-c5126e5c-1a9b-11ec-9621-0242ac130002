package com.aniruddha.kudalkar.jetpackapps.anidemo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    private val users : MutableLiveData<MutableList<AppUser>> = MutableLiveData()

    fun getUsers() : LiveData<MutableList<AppUser>>  = users

    fun onClick() {
        Log.i("@ani", "Clicned")
        users.value?.add(AppUser())
    }
}