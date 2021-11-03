package com.aniruddha.kudalkar.retrofitbasics

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReqResHolder(
    private val vw : View
) : RecyclerView.ViewHolder(vw) {

    fun pp() = vw.findViewById<ImageView>(R.id.img)

    fun nm() = vw.findViewById<TextView>(R.id.txNm)

    fun eml() = vw.findViewById<TextView>(R.id.txEm)
}

class ReqResAdapter(
    private val context : Context,
    private val users: List<ReqResUser>
): RecyclerView.Adapter<ReqResHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReqResHolder {
        val vw = LayoutInflater.from(context).inflate(
            R.layout.req_res_user_item,
            parent,
            false
        )
        return ReqResHolder(vw)
    }

    override fun onBindViewHolder(holder: ReqResHolder, position: Int) {
//        holder.pp().setImageURI(Uri.parse())
        holder.nm().setText(users[position].first_name + users[position].last_name )
        holder.eml().setText(users[position].email)
    }

    override fun getItemCount(): Int = users.size
}