package com.aniruddha.kudalkar.jetpackapps

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.pow

class FriendHolder(
    private val view: View
) : RecyclerView.ViewHolder(view) {

    fun userNameTextView() = view.findViewById<TextView>(R.id.txNm)

    fun mobileTextView() = view.findViewById<TextView>(R.id.txMob)

    fun handleTextView() = view.findViewById<TextView>(R.id.txHnd)

    fun profilePictureImageView() = view.findViewById<ImageView>(R.id.imgDp)
}

fun emiCalculation(principalAmount: Double, rateOfInterest: Double, duration: Double): Double {
    val num = (1 + rateOfInterest).pow(duration)
    val den = num - 1
    val emi = principalAmount * rateOfInterest * (num / den)
    return emi
}

fun emiCalculationV1(p: Double, r: Double, n: Double) =
    p * r * ((1 + r).pow(n) / (((1 + r).pow(n))) - 1)