package com.aniruddha.kudalkar.sqliteroombasics.ui

import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aniruddha.kudalkar.sqliteroombasics.R

class DealerViewHolder(
    private val infVw : View
) : RecyclerView.ViewHolder(infVw) {

    fun dlNm() = infVw.findViewById<TextView>(R.id.txtDlNm)

    fun dlMb() =  infVw.findViewById<TextView>(R.id.txtDlMb)

    fun chk() = infVw.findViewById<CheckBox>(R.id.checkBox)
}