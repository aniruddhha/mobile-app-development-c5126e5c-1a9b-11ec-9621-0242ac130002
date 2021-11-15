package com.aniruddha.kudalkar.industryprojectstructure.sqlite

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.aniruddha.kudalkar.industryprojectstructure.dao.OrganizationDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SqliteConfigModule {

    @Singleton
    @Provides
    fun database(
        @ApplicationContext context : Context
    ) : IndustryProjectAppDb = Room.databaseBuilder(
            context,
            IndustryProjectAppDb::class.java,
            "trello_db"
        ).build()

    @Singleton
    @Provides
    fun organizationDao(appDb : IndustryProjectAppDb) = appDb.organizationDao()
}