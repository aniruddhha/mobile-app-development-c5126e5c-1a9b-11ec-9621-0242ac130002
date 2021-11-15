package com.aniruddha.kudalkar.industryprojectstructure.repository

import com.aniruddha.kudalkar.industryprojectstructure.rest.TrelloOrganizationApi
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class RemoteOrganizationRepository
@Inject
constructor(
    private val trelloOrganizationApi: TrelloOrganizationApi
) {
}