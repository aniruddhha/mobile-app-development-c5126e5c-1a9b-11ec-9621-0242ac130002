package com.aniruddha.kudalkar.industryprojectstructure.repository

import com.aniruddha.kudalkar.industryprojectstructure.dao.OrganizationDao
import com.aniruddha.kudalkar.industryprojectstructure.domain.Organization
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalOrganizationRepository
@Inject
constructor(
    private val daoOrganization : OrganizationDao
) {
    suspend fun createOrganization(organization: Organization) = daoOrganization.createOrganization(organization)
}