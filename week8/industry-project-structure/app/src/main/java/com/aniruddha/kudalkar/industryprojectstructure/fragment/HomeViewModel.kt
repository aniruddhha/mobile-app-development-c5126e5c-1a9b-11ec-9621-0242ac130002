package com.aniruddha.kudalkar.industryprojectstructure.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aniruddha.kudalkar.industryprojectstructure.adapter.RecyclerItemOperation
import com.aniruddha.kudalkar.industryprojectstructure.domain.Organization
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel
@Inject
constructor(): ViewModel() {
    private val _item : MutableLiveData<RecyclerItemOperation> = MutableLiveData(
        RecyclerItemOperation(
            "",
            Organization(0, "", "", ""),
            0
        )
    )

    val item : LiveData<RecyclerItemOperation> = _item

    fun onItemClick(clickedItem : RecyclerItemOperation) {
        _item.value = clickedItem
    }
}

