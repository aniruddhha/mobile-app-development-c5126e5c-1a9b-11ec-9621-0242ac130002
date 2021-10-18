package com.aniruddha.kudalkar.myapplication.recgrd


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

    }

    override fun getItemCount(): Int = dataSource.size
}

class RecDshViewHolder(
    private val view: View
) : RecyclerView.ViewHolder(view)