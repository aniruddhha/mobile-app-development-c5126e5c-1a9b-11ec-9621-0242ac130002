package com.aniruddha.kudalkar.jetpackapps.emicalc

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EmiViewModel: ViewModel() {
    val emi : MutableLiveData<Int> = MutableLiveData()
}