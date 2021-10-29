package com.aniruddha.kudalkar.sqlitecasestudy.ui.expense

import android.content.Context
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aniruddha.kudalkar.sqlitecasestudy.R
import com.aniruddha.kudalkar.sqlitecasestudy.db.Expense

class ExpenseListAdapter(
    private val context : Context,
    private val dataSource : List<Expense>
) : RecyclerView.Adapter<ExpenseListHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseListHolder {

        val infVw = LayoutInflater.from(context).inflate(
            R.layout.expense_list_item,
            parent ,
            false
        )

        return ExpenseListHolder(infVw)
    }

    override fun onBindViewHolder(holder: ExpenseListHolder, position: Int) {
        holder.expNm().text = dataSource[position].nm
        holder.amt().text = "${dataSource[position].amt}"
        holder.dt().text = "${dataSource[position].dt}"
    }

    override fun getItemCount() = dataSource.size
}

class ExpenseListHolder(
    private val infVw : View
) : RecyclerView.ViewHolder(infVw) {

    fun expNm() = infVw.findViewById<TextView>(R.id.txtExNm)

    fun amt() = infVw.findViewById<TextView>(R.id.txAmt)

    fun dt() = infVw.findViewById<TextView>(R.id.txTm)
}
