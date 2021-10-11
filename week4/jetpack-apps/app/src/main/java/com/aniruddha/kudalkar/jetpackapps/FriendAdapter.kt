package com.aniruddha.kudalkar.jetpackapps

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
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
        holder.profilePictureImageView().setImageResource(friends[position].icon)
        holder.userNameTextView().setText(friends[position].name)
        holder.mobileTextView().setText(friends[position].mobile)
        holder.handleTextView().setText(friends[position].handle)
    }

    override fun getItemCount() = friends.size
}

