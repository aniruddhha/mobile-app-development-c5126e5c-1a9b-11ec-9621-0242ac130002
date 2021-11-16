package com.aniruddha.kudalkar.industryprojectstructure.repository

import com.aniruddha.kudalkar.industryprojectstructure.dao.OrganizationDao
import com.aniruddha.kudalkar.industryprojectstructure.domain.Organization
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject
import javax.inject.Singleton

@ViewModelScoped
class LocalOrganizationRepository
@Inject
constructor(
    private val daoOrganization : OrganizationDao
) {
    fun createOrganization(organization: Organization) = daoOrganization.createOrganization(organization)
}