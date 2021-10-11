package com.aniruddha.kudalkar.jetpackapps

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FriendHolder(
    private val view: View
) : RecyclerView.ViewHolder(view) {

    fun userNameTextView() = view.findViewById<TextView>(R.id.txNm)

    fun mobileTextView() = view.findViewById<TextView>(R.id.txMob)

    fun handleTextView() = view.findViewById<TextView>(R.id.txHnd)

    fun profilePictureImageView() = view.findViewById<ImageView>(R.id.imgDp)
}
