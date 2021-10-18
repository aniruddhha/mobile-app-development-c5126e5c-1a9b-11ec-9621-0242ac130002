package com.aniruddha.kudalkar.myapplication.recgrd

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aniruddha.kudalkar.myapplication.R

data class RecDsh(
    val menu : String,
    val icon : Int
)

class RecDshAdapter(
    private val context : Context,
    private val dataSource : List<RecDsh>
) : RecyclerView.Adapter<RecDshViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecDshViewHolder {
        val vw = LayoutInflater.from(context).inflate(R.layout.rec_dsh_item, parent, false)
        return RecDshViewHolder(vw)
    }

    override fun onBindViewHolder(holder: RecDshViewHolder, position: Int) {
        holder.icon().setImageResource(dataSource[position].icon)
        holder.label().setText(dataSource[position].menu)
    }

    override fun getItemCount(): Int = dataSource.size
}

class RecDshViewHolder(
    private val view: View
) : RecyclerView.ViewHolder(view) {

    fun icon() = view.findViewById<ImageView>(R.id.icMn)

    fun label() = view.findViewById<TextView>(R.id.lbMn)
}