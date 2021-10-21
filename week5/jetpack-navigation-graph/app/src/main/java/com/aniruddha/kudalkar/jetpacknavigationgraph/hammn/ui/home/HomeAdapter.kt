package com.aniruddha.kudalkar.jetpacknavigationgraph.hammn.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.aniruddha.kudalkar.jetpacknavigationgraph.R

class HomeAdapter(
    private val context : Context,
    private val dataSource : List<HomeData>
) : RecyclerView.Adapter<HomeViewHolder>() {

    private val _clkPos = MutableLiveData<Int>()
    val clkPos: LiveData<Int> = _clkPos

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {

        val root = LayoutInflater.from(context).inflate(
            R.layout.home_rec_item,
            parent,
            false
        )

        return HomeViewHolder(root)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {

        holder.itemView.setOnClickListener {
            _clkPos.value = position
        }
        holder.from().text = dataSource[position].from
        holder.time().text = dataSource[position].time

        holder.switch().setOnCheckedChangeListener { _, isChecked ->
            dataSource[position].blb = isChecked
        }
    }

    override fun getItemCount(): Int = dataSource.size
}