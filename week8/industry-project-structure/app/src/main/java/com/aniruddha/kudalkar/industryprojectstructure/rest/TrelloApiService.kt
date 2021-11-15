package com.aniruddha.kudalkar.industryprojectstructure.rest

import com.aniruddha.kudalkar.industryprojectstructure.dto.OrganizationDto
import retrofit2.http.GET

interface TrelloOrganizationApi {

    @GET("members/me/organizations")
    suspend fun organizations() :  List<OrganizationDto>
}

interface TrelloBoardApi {
}

interface TrelloListApi {

}

interface TrelloCardApi {
}

