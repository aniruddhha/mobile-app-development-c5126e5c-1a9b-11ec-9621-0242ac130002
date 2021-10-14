package com.aniruddha.kudalkar.jetpackapps.stockapp

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StockViewModel: ViewModel() {

    val loginCheck : MutableLiveData<Int> = MutableLiveData()

    val userName : MutableLiveData<String> = MutableLiveData()
    val password : MutableLiveData<String> = MutableLiveData()

    fun onLogin() {
        Log.i("@ani", "User Logged In")
        Log.i("@ani", "User Name - ${userName.value}")
        Log.i("@ani", "Password - ${password.value}")
        if(userName.value == "android" && password.value == "android") {
            loginCheck.value = 100
        }else {
            loginCheck.value = -100
        }
    }
}