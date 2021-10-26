package com.aniruddha.kudalkar.expensemanager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Expense(
    var id : Int,
    var expense : String,
    var amount : Double,
    var ic : Int
)

class ExpenseListAdapter(
    private val context : Context,
    private val dataSource: List<Expense>
) : RecyclerView.Adapter<ExpenseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
        val vw = LayoutInflater.from(context).inflate(R.layout.expense_list_item, parent, false)
        return ExpenseViewHolder(vw)
    }

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {
        val expense = dataSource[position]

        holder.expenseName().text = expense.expense
        holder.expenseAmt().text = "${expense.amount}"
        holder.expenseIc().setImageResource(expense.ic)
    }

    override fun getItemCount(): Int = dataSource.size
}


class ExpenseViewHolder(
    private val infVw : View
): RecyclerView.ViewHolder(infVw) {

    fun rootView() = infVw

    fun expenseName() = infVw.findViewById<TextView>(R.id.txtExpNm)

    fun expenseAmt() = infVw.findViewById<TextView>(R.id.txtExpAmt)

    fun expenseIc() = infVw.findViewById<ImageView>(R.id.imgIc)
}