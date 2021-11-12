package com.aniruddha.kudalkar.industryprojectstructure.rest

import com.aniruddha.kudalkar.industryprojectstructure.domain.Organization
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TrelloOrganizationApi {

    @GET("members/me/organizations")
    suspend fun organizations() :  List<Organization>
}

interface TrelloBoardApi {
}

interface TrelloListApi {

}

interface TrelloCardApi {
}

