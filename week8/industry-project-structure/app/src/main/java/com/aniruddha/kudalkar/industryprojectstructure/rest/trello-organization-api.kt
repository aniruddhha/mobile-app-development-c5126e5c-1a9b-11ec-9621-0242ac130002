package com.aniruddha.kudalkar.industryprojectstructure.rest

import com.aniruddha.kudalkar.industryprojectstructure.dto.OrganizationDto
import retrofit2.http.*

interface TrelloOrganizationApi {

    @GET("members/me/organizations")
    suspend fun organizations() :  List<OrganizationDto>

    @POST("organizations")
    suspend fun create(
        @Query("displayName") displayName : String,
        @Query("desc") description : String,
    ) : OrganizationDto

    @DELETE("organizations/{id}")
    suspend fun delete(@Path("id") organizationId : String)

    @PUT("organizations/{id}")
    suspend fun update(
        @Path("id") organizationId : String,
        @Query("displayName") name : String,
        @Query("desc") description : String,
    )
}