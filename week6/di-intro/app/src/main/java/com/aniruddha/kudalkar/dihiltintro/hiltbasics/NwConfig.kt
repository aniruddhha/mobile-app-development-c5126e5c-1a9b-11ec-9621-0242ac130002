package com.aniruddha.kudalkar.dihiltintro.hiltbasics

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NwConfig
@Inject
constructor(
    val gc : GenConfig // constructor injection
) {
    fun config() = Log.i("@ani", "Configuring Network")
}