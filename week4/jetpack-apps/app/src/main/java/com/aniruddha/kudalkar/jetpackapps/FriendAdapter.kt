package com.aniruddha.kudalkar.jetpackapps

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FriendAdapter(
    private val context: Context,
    private val friends: List<Friend>
) : RecyclerView.Adapter<FriendHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendHolder {
        val inflater = LayoutInflater.from(context)
        val vw = inflater.inflate(R.layout.recycler_item, parent, false)
        return FriendHolder(vw)
    }

    override fun onBindViewHolder(holder: FriendHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = friends.size
}

class FriendHolder(
    private val view: View
) : RecyclerView.ViewHolder(view) {

    fun userNameTextView() = view.findViewById<TextView>(R.id.txNm)

    fun mobileTextView() = view.findViewById<TextView>(R.id.txMob)

    fun handleTextView() = view.findViewById<TextView>(R.id.txHnd)

    fun profilePictureImageView() = view.findViewById<ImageView>(R.id.imgDp)
}
