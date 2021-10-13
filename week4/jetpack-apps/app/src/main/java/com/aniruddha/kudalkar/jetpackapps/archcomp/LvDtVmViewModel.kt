package com.aniruddha.kudalkar.jetpackapps.archcomp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LvDtVmViewModel: ViewModel() {

    val prg : MutableLiveData<String> = MutableLiveData("5665")

    fun onPrgCh( pr : Int) {
        prg.value = "$pr"
    }
}