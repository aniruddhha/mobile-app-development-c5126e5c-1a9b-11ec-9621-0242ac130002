package com.aniruddha.kudalkar.expensemanager

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExpenseViewModel : ViewModel() {

    private val _expenses: MutableLiveData<ArrayList<Expense>> = MutableLiveData()
    val expenses: LiveData<ArrayList<Expense>> = _expenses

    init {
        loadData()
    }

    private fun loadData() {
        _expenses.value = arrayListOf(
            Expense(1, "Tea", 10.0, R.drawable.ic_plc),
            Expense(2, "Coffee", 15.0, R.drawable.ic_plc),
            Expense(3, "Vada Pav", 15.0, R.drawable.ic_plc),
            Expense(4, "Cold Coffee", 25.0, R.drawable.ic_plc)
        )
    }

    fun getExpenses() = expenses.value ?: listOf()

    fun createExpense( expense: Expense ) {
        _expenses.value?.add(expense)
    }

    fun loadExpenseById(id : Int) : Expense {
        for(exp in getExpenses()) {
            if(id == exp.id) return exp
        }
        return  Expense(0, "", 0.0, 1)
    }

    fun loadExpById(id : Int) = expenses.value?.find { exp -> exp.id == id }
}