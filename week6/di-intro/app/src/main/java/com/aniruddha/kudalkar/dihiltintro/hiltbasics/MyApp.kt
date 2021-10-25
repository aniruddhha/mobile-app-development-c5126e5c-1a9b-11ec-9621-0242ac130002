package com.aniruddha.kudalkar.dihiltintro.hiltbasics

import android.app.Application
import com.google.gson.Gson
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp // hey dagger please create/provide/delete this object. Also dagger says, dont write @AndroidEntryPoint
class MyApp : Application() {

    // hey dagger please give me the object that you have created for NwConfig class
    @Inject lateinit var nwConfig: NwConfig // field injection

    // hey dagger please give me the object that you have created for Gson class
    @Inject lateinit var gson : Gson

    override fun onCreate() {
        super.onCreate()

        nwConfig.config()
    }
}