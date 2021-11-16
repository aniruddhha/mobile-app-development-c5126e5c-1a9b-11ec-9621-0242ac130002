package com.aniruddha.kudalkar.industryprojectstructure.repository

import com.aniruddha.kudalkar.industryprojectstructure.domain.Organization
import com.aniruddha.kudalkar.industryprojectstructure.dto.OrganizationDto
import com.aniruddha.kudalkar.industryprojectstructure.rest.TrelloOrganizationApi
import com.aniruddha.kudalkar.industryprojectstructure.rest.handleRequest
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteOrganizationRepository
@Inject
constructor(
    private val trelloOrganizationApi: TrelloOrganizationApi
) {
    suspend fun createOrganization(organization : Organization): Result<OrganizationDto> = handleRequest {
        trelloOrganizationApi.create(organization.displayName, organization.desc)
    }

    suspend fun organizations() : Result<List<Organization>> = handleRequest {
        trelloOrganizationApi.organizations().map {
            Organization(displayName = it.displayName, organizationId = it.id, desc = it.desc, id = 0 )
        }
    }

    suspend fun deleteOrganization(id : String) : Result<Any> = handleRequest {
        trelloOrganizationApi.delete(id)
    }
}