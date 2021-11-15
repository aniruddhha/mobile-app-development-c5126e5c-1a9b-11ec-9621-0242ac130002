package com.aniruddha.kudalkar.industryprojectstructure.repository

import com.aniruddha.kudalkar.industryprojectstructure.domain.Organization
import com.aniruddha.kudalkar.industryprojectstructure.dto.OrganizationDto
import com.aniruddha.kudalkar.industryprojectstructure.rest.TrelloOrganizationApi
import com.aniruddha.kudalkar.industryprojectstructure.rest.handleRequest
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class RemoteOrganizationRepository
@Inject
constructor(
    private val trelloOrganizationApi: TrelloOrganizationApi
) {
    suspend fun createOrganization(organization : Organization): Result<OrganizationDto> = handleRequest {
        trelloOrganizationApi.createOrganization(organization.displayName, organization.desc)
    }
}