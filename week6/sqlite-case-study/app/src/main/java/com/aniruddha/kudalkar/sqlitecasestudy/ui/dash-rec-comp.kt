package com.aniruddha.kudalkar.sqlitecasestudy.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aniruddha.kudalkar.sqlitecasestudy.R

data class DashItem(
    var id : Int = 0,
    var ic: Int,
    var lbl : String
)

class DashAdapter(
    private val context: Context,
    private val dataSource : List<DashItem>
) : RecyclerView.Adapter<DashViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashViewHolder {
        val root = LayoutInflater.from(context).inflate(
            R.layout.dash_grid_item,
            parent,
            false
        )
        return DashViewHolder(root)
    }

    override fun onBindViewHolder(holder: DashViewHolder, position: Int) {
        holder.ic().setImageResource(dataSource[position].ic)
        holder.lbl().setText(dataSource[position].lbl)
    }

    override fun getItemCount() = dataSource.size
}

class DashViewHolder(
    private val infVw : View
) : RecyclerView.ViewHolder(infVw) {

    fun infVw() = infVw

    fun ic() = infVw.findViewById<ImageView>(R.id.icItm)

    fun lbl() = infVw.findViewById<TextView>(R.id.lbItm)
}
