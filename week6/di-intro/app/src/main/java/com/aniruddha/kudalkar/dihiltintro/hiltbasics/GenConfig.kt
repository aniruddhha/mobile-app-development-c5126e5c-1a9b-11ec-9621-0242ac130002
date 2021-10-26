package com.aniruddha.kudalkar.dihiltintro.hiltbasics

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

class GenConfig
 // // hey dagger please create/provide/delete this object
constructor() {
    fun genConfig() = Log.i("@ani", "General Config")
}