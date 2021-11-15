package com.aniruddha.kudalkar.industryprojectstructure.rest

import com.aniruddha.kudalkar.industryprojectstructure.dto.OrganizationDto
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface TrelloOrganizationApi {

    @GET("members/me/organizations")
    suspend fun organizations() :  List<OrganizationDto>

    @POST("organizations")
    suspend fun createOrganization(
        @Query("displayName") displayName : String,
        @Query("desc") description : String,
    ) : OrganizationDto
}