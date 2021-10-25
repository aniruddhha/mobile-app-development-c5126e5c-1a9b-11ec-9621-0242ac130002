package com.aniruddha.kudalkar.dihiltintro.hiltbasics

import android.util.Log
import javax.inject.Inject

class NwConfig
@Inject
constructor() {

    fun config() = Log.i("@ani", "Configuring Network")
}