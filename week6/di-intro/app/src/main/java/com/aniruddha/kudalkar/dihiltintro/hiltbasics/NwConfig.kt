package com.aniruddha.kudalkar.dihiltintro.hiltbasics

import android.util.Log
import com.google.gson.Gson
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject
import javax.inject.Singleton

@Singleton // hey dagger please put this object in application scope
class NwConfig
@Inject // hey dagger please create/provide/delete this object
constructor(
    val gc : GenConfig, // constructor injection
    val gson : Gson // for example i have taken gson, it can be anything
) {
    fun config() = Log.i("@ani", "Configuring Network")
}