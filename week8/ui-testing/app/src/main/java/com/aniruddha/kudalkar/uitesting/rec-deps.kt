package com.aniruddha.kudalkar.uitesting

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class RecItm(
    var id : Long,
    var itm : String
)

class RecVh(
    private val infVw : View
) : RecyclerView.ViewHolder(infVw) {
    fun itm() = infVw.findViewById<TextView>(R.id.txtNm)
}

class RecAdapter(
    private val context : Context,
    private val items : List<RecItm>

) : RecyclerView.Adapter<RecVh>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecVh {
        val infVw = LayoutInflater.from(context)
            .inflate(
                R.layout.rec_itm,
                parent,
                false
            )

        return RecVh(infVw)
    }

    override fun onBindViewHolder(holder: RecVh, position: Int) {
        holder.itm().setText(items[position].itm)
    }

    override fun getItemCount(): Int = items.size
}