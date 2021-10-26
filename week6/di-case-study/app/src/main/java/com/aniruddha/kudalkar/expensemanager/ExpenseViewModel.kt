package com.aniruddha.kudalkar.expensemanager

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExpenseViewModel
@Inject
constructor(
    private val localDataSource : LocalDataSource
) : ViewModel() {

    private val _expenses: MutableLiveData<ArrayList<Expense>> = MutableLiveData()
    val expenses: LiveData<ArrayList<Expense>> = _expenses

    init {
       _expenses.value = ArrayList(localDataSource.loadData())
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