package com.aniruddha.kudalkar.industryprojectstructure.sqlite

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aniruddha.kudalkar.industryprojectstructure.dao.OrganizationDao
import com.aniruddha.kudalkar.industryprojectstructure.domain.Organization

@Database(entities = [Organization::class], version = 1)
abstract class IndustryProjectAppDb : RoomDatabase() {
    abstract fun organizationDao() : OrganizationDao
}