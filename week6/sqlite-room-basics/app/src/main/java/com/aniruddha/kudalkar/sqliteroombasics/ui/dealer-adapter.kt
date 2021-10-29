package com.aniruddha.kudalkar.sqliteroombasics.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aniruddha.kudalkar.sqliteroombasics.R
import com.aniruddha.kudalkar.sqliteroombasics.db.Dealer

class DealerAdapter(
    private val context : Context,
    private val dataSource : List<Dealer>
) : RecyclerView.Adapter<DealerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DealerViewHolder {
        val root = LayoutInflater.from(context).inflate(
            R.layout.dealer_item,
            parent,
            false
        )

        return DealerViewHolder(root)
    }

    override fun onBindViewHolder(holder: DealerViewHolder, position: Int) {

        holder.dlNm().text = dataSource[position].dlNm
        holder.dlMb().text = dataSource[position].mobile
        holder.chk().isChecked = dataSource[position].isActive
    }

    override fun getItemCount(): Int  = dataSource.size
}