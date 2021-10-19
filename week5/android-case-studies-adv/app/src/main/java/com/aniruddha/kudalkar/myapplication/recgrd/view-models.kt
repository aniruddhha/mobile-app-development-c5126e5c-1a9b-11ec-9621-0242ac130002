package com.aniruddha.kudalkar.myapplication.recgrd

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class SharedViewModel : ViewModel() {
    private val _appData = MutableLiveData<SalaryCard>()
    val appData: LiveData<SalaryCard> = _appData

    private val name = MutableLiveData<String>()
    private val mobile = MutableLiveData<String>()
    private val email = MutableLiveData<String>()
    private val age = MutableLiveData<Int>()

    private val basicSalary = MutableLiveData<Double>()
    private val hra = MutableLiveData<Double>()
    private val ta = MutableLiveData<Double>()
    private val ctc = MutableLiveData<Double>()

    private fun saveData(dt : SalaryCard) {
        _appData.value = dt.copy()
        Log.i("@ani", "In Parent")
        Log.i("@ani", _appData.value.toString())
    }

    fun onNameChanged(nm : String) {
        name.value = nm
        Log.i("@ani", "Name ${name.value}")
    }

    fun onMobileChanged(mb : String) {
        mobile.value = mb
        Log.i("@ani", "Mobile ${mobile.value}")
    }

    fun onEmailChanged(em : String) {
        email.value = em
        Log.i("@ani", "Email ${email.value}")
    }

    fun onAgeChanged(ag : String) {
        age.value = ag.toInt()
        Log.i("@ani", "Age ${age.value}")
    }


    fun onBasicSalaryChanged(sal  : String) {
        basicSalary.value = sal.toDouble()
    }

    fun onHraChanged(h : String) {
        hra.value = h.toDouble()
    }

    fun onTaChanged(t : String) {
        ta.value = t.toDouble()
    }

    fun onCtcChanged(c : String) {
        ctc.value = c.toDouble()
    }

    fun onSdSaveClicked() {
        val sd = SalaryDetails(
            basicSalary = basicSalary.value ?: 0.0,
            ta = ta.value ?: 0.0,
            ctc = ctc.value ?: 0.0,
            hra = hra.value ?: 0.0
        )

        saveData(
            SalaryCard(sd = sd, bd = _appData.value?.bd ?: BasicDetails())
        )
    }

    fun onBdSaveClicked() {
        val bd = BasicDetails(
            name = name.value ?: "",
            mobile = mobile.value ?: "",
            email = email.value ?: "",
            age = age.value ?: 0,
        )

        Log.i("@ani", bd.toString())

        saveData(
            SalaryCard(bd = bd, sd = _appData.value?.sd ?: SalaryDetails())
        )
    }
}

