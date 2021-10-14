package com.aniruddha.kudalkar.jetpackapps.emicalc

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.pow

class EmiViewModel: ViewModel() {
    val emi : MutableLiveData<Double> = MutableLiveData(0.0)

    val p : MutableLiveData<Int> = MutableLiveData(0)
    val r : MutableLiveData<Int> = MutableLiveData(0)
    val n : MutableLiveData<Int> = MutableLiveData(0)

    fun changeProgress(progress : Int, type : String) {
        when (type) {
            "P" -> p.value = progress
            "R" -> r.value = progress
            else -> n.value = progress
        }
        emi.value = emiCalc(
            p.value?.toDouble() ?: 0.0  ,
            r.value?.toDouble() ?: 0.0 ,
            n.value?.toDouble() ?: 0.0
        )
    }

    fun etChangeProgress(progress: String, type : String) {
        val prg = if(progress.isNotEmpty()) progress.toInt() else 0
        when (type) {
            "P" -> p.value = prg
            "R" -> r.value = prg
            else -> n.value = prg
        }
        emi.value = emiCalc(
            p.value?.toDouble() ?: 0.0  ,
            r.value?.toDouble() ?: 0.0 ,
            n.value?.toDouble() ?: 0.0
        )
    }

    fun getProgress(type : String) = when(type) {
        "P" -> p
        "R" -> r
        else -> n
    }

    private fun emiCalc(principalAmount: Double, rateOfInterest: Double, duration: Double): Double {
        val num = (1 + rateOfInterest).pow(duration)
        val den = num - 1
        val em = principalAmount * rateOfInterest * (num / den)
        return em
    }
}