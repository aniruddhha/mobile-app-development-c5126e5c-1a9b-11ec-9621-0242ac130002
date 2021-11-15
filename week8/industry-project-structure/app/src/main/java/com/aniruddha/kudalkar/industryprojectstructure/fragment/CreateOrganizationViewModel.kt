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
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CreateOrganizationViewModel
@Inject
constructor(
    private val localOrganizationRepository: LocalOrganizationRepository,
    private val remoteOrganizationRepository: RemoteOrganizationRepository
) : ViewModel() {

    private val _isProcessing : MutableLiveData<Boolean> = MutableLiveData(false)
    val isProcessing: LiveData<Boolean> = _isProcessing

    private val organization: MutableLiveData<Organization> = MutableLiveData(
        Organization(0, "", "")
    )

    fun onNameChanged(str: String) {
        organization.value?.displayName = str
    }

    fun onDescChanged(desc: String) {
        organization.value?.desc = desc
    }

    fun onCreateClicked() {
        _isProcessing.value = true
        viewModelScope.launch {
            organization.value?.let {
                val result = remoteOrganizationRepository.createOrganization(it)
                if (result.isSuccess) {
                    Log.i("@ani", "Operation Is Successful")
                    _isProcessing.value = false
                } else {
                    Log.i("@ani", "Operation Failed")
                    _isProcessing.value = false
                }
            }
        }
    }
}