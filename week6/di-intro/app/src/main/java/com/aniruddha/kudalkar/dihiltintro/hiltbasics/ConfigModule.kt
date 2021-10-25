package com.aniruddha.kudalkar.dihiltintro.hiltbasics

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module // hey dagger, this will provide/install objects
@InstallIn(SingletonComponent::class) // in given scope
object ConfigModule  {

    @Singleton // hey dagger please put this object in application scope
    @Provides //  hey dagger please create/provide/delete this object
    fun getGson() = Gson()
}