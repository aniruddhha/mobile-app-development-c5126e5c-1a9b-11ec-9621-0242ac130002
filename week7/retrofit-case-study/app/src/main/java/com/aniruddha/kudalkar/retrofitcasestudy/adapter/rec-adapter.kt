package com.aniruddha.kudalkar.retrofitcasestudy.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aniruddha.kudalkar.retrofitcasestudy.R
import com.aniruddha.kudalkar.retrofitcasestudy.domain.GithubUser

class RecVwHolder(
    private val infVw : View
) : RecyclerView.ViewHolder(infVw)

class RecAdapter(
    private val context :  Context,
    private val users : List<GithubUser>
) : RecyclerView.Adapter<RecVwHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecVwHolder {

        val infVw =  LayoutInflater.from(context).inflate(
            R.layout.rec_item,
            parent,
            false
        )

        return RecVwHolder(infVw)
    }

    override fun onBindViewHolder(holder: RecVwHolder, position: Int) {
    }

    override fun getItemCount(): Int = users.size
}

