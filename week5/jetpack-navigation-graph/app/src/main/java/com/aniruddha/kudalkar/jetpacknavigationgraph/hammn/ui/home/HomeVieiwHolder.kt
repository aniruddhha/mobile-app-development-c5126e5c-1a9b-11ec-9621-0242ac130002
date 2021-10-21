package com.aniruddha.kudalkar.jetpacknavigationgraph.hammn.ui.home

import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aniruddha.kudalkar.jetpacknavigationgraph.R

class HomeViewHolder(
    private val itemView : View
) : RecyclerView.ViewHolder(itemView) {

    fun root() = itemView

    fun from() = itemView.findViewById<TextView>(R.id.textView7)

    fun time() = itemView.findViewById<TextView>(R.id.textView8)

    fun switch() = itemView.findViewById<Switch>(R.id.switch1)
}