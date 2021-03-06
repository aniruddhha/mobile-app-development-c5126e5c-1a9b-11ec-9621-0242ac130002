package com.aniruddha.kudalkar.industryprojectstructure.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.aniruddha.kudalkar.industryprojectstructure.R
import com.aniruddha.kudalkar.industryprojectstructure.domain.Organization
import com.aniruddha.kudalkar.industryprojectstructure.fragment.HomeViewModel

data class RecyclerItemOperation(
    val operation: String,
    val organization: Organization,
    val position: Int
)

class HomeViewHolder(
    private val infVw: View
) : RecyclerView.ViewHolder(infVw) {

    fun name() = infVw.findViewById<TextView>(R.id.txtOrgNm)

    fun image() = infVw.findViewById<ImageView>(R.id.imgOrg)

    fun delete() = infVw.findViewById<ImageView>(R.id.imgDel)

    fun edit() = infVw.findViewById<ImageView>(R.id.imgEdt)
}

class HomeAdapter(
    private val context: Context,
    private val organizations: List<Organization>,
    private val vm: HomeViewModel
) : RecyclerView.Adapter<HomeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {

        val infVw = LayoutInflater.from(context).inflate(
            R.layout.home_recycler_item,
            parent,
            false
        )

        return HomeViewHolder(infVw)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {

        holder.delete().setOnClickListener {
            val item = RecyclerItemOperation(
                "delete", organizations[position], position
            )
            vm.onItemClick(item)
        }

        holder.edit().setOnClickListener {
            val item = RecyclerItemOperation(
                "edit", organizations[position], position
            )
            vm.onItemClick(item)
        }

        holder.name().text = organizations[position].displayName
    }

    override fun getItemCount() = organizations.size
}