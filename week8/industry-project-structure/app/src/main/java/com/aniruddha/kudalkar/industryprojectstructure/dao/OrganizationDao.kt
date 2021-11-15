package com.aniruddha.kudalkar.industryprojectstructure.dao

import androidx.room.Dao
import androidx.room.Insert
import com.aniruddha.kudalkar.industryprojectstructure.domain.Organization

@Dao
interface OrganizationDao {
    @Insert
    fun createOrganization(organization: Organization)
}