package com.aniruddha.kudalkar.dihiltintro.hiltbasics

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NwConfig
@Inject
constructor() {

    fun config() = Log.i("@ani", "Configuring Network")
}