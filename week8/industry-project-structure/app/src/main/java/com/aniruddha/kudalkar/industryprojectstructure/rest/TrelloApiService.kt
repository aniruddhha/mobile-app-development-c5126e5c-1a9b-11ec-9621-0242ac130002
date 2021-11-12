package com.aniruddha.kudalkar.industryprojectstructure.rest

import com.aniruddha.kudalkar.industryprojectstructure.domain.Organization
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TrelloOrganizationApi {

    @GET("members/me/organizations")
    suspend fun organizations(
        @Query("key") key : String = "",
        @Query("token") token: String = ""
    ) :  List<Organization>
}

interface TrelloBoardApi {
}

interface TrelloListApi {

}

interface TrelloCardApi {
}

