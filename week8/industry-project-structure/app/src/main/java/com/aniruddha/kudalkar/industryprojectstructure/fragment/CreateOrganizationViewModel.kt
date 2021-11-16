package com.aniruddha.kudalkar.industryprojectstructure.fragment

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aniruddha.kudalkar.industryprojectstructure.domain.Organization
import com.aniruddha.kudalkar.industryprojectstructure.repository.LocalOrganizationRepository
import com.aniruddha.kudalkar.industryprojectstructure.repository.RemoteOrganizationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CreateOrganizationViewModel
@Inject
constructor(
    private val localOrganizationRepository: LocalOrganizationRepository,
    private val remoteOrganizationRepository: RemoteOrganizationRepository
) : ViewModel() {

    private val _isProcessing: MutableLiveData<Boolean> = MutableLiveData(false)
    val isProcessing: LiveData<Boolean> = _isProcessing

    private val _organization: MutableLiveData<Organization> = MutableLiveData(
        Organization(0, displayName = "", desc = "", organizationId = null)
    )

    val organization: LiveData<Organization> = _organization

    fun onNameChanged(str: String) {
        _organization.value?.displayName = str
    }

    fun onDescChanged(desc: String) {
        _organization.value?.desc = desc
    }

    fun onCreateClicked() {
        _isProcessing.value = true

        organization.value?.let {
            saveOrganizationToDb(it)
            sendOrganizationToServer(it)
        }
    }

    private fun saveOrganizationToDb(organization: Organization) {
        viewModelScope.launch(Dispatchers.IO) {
            localOrganizationRepository.createOrganization(organization)
        }
    }

    private fun sendOrganizationToServer(organization: Organization) {
        viewModelScope.launch {
            val result = remoteOrganizationRepository.createOrganization(organization)
            if (result.isSuccess) {
                Log.i("@ani", "Operation Is Successful")
                _isProcessing.value = false
                clearData()
            } else {
                Log.i("@ani", "Operation Failed")
                _isProcessing.value = false
            }
        }
    }

    private fun clearData() {
        _organization.value = Organization(0, organizationId = null, displayName = "", desc = "")
    }
}