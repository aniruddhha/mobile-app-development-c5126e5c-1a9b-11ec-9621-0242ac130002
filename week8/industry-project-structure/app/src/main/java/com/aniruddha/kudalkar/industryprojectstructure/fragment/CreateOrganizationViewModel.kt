package com.aniruddha.kudalkar.industryprojectstructure.fragment

import androidx.lifecycle.ViewModel
import com.aniruddha.kudalkar.industryprojectstructure.repository.LocalOrganizationRepository
import com.aniruddha.kudalkar.industryprojectstructure.repository.RemoteOrganizationRepository
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class CreateOrganizationViewModel
@Inject
constructor(
    private val localOrganizationRepository: LocalOrganizationRepository,
    private val remoteOrganizationRepository: RemoteOrganizationRepository
) : ViewModel() {

}