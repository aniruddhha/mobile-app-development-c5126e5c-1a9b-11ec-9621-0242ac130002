package com.aniruddha.kudalkar.jetpackapps.emicalc

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.pow

class EmiViewModel: ViewModel() {
    val emi : MutableLiveData<Double> = MutableLiveData(0.0)
    val p : MutableLiveData<Double> = MutableLiveData(0.0)
    val r : MutableLiveData<Double> = MutableLiveData(0.0)
    val n : MutableLiveData<Double> = MutableLiveData(0.0)

    fun changeProgress(progress : Int, type : String) {
        when (type) {
            "P" -> p.value = progress.toDouble()
            "R" -> r.value = progress.toDouble()
            else -> n.value = progress.toDouble()
        }
        emi.value = emiCalc(p.value ?: 0.0, r.value ?: 0.0 , n.value ?: 0.0)
    }


    private fun emiCalc(principalAmount: Double, rateOfInterest: Double, duration: Double): Double {
        val num = (1 + rateOfInterest).pow(duration)
        val den = num - 1
        val em = principalAmount * rateOfInterest * (num / den)
        return em
    }
}