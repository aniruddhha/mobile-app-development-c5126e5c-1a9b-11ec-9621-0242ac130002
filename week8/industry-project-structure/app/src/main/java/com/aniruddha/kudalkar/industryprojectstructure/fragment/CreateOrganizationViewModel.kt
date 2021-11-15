package com.aniruddha.kudalkar.industryprojectstructure.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aniruddha.kudalkar.industryprojectstructure.domain.Organization
import com.aniruddha.kudalkar.industryprojectstructure.repository.LocalOrganizationRepository
import com.aniruddha.kudalkar.industryprojectstructure.repository.RemoteOrganizationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@HiltViewModel
class CreateOrganizationViewModel
@Inject
constructor(
    private val localOrganizationRepository: LocalOrganizationRepository,
    private val remoteOrganizationRepository: RemoteOrganizationRepository
) : ViewModel() {

    private val _organization : MutableLiveData<Organization> = MutableLiveData(
        Organization(0, "", "")
    )
    private val organization: LiveData<Organization> = _organization

    fun onNameChanged(str : String) {
        organization.value?.displayName = str
    }

    fun onDescChanged(desc : String) {
        organization.value?.desc = desc
    }

    fun onCreateClicked() {
        organization.value?.let {
            viewModelScope.launch {
                remoteOrganizationRepository.createOrganization(it)
            }
        }
    }
}