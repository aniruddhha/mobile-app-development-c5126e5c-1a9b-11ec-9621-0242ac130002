package com.aniruddha.kudalkar.dihiltintro.hiltbasics

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApp : Application() {

    @Inject lateinit var nwConfig: NwConfig // field injection

    override fun onCreate() {
        super.onCreate()

        nwConfig.config()
    }
}