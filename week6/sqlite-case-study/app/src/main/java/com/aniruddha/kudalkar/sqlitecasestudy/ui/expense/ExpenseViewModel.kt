package com.aniruddha.kudalkar.sqlitecasestudy.ui.expense

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aniruddha.kudalkar.sqlitecasestudy.db.Expense
import com.aniruddha.kudalkar.sqlitecasestudy.db.ExpenseDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ExpenseViewModel : ViewModel() {

    private var daoExpense : ExpenseDao? = null

    private val _name = MutableLiveData<String>()
    val name : LiveData<String> = _name

    private val _amount = MutableLiveData<Double>()
    val amount :LiveData<Double> = _amount

    private val _date = MutableLiveData<Long> ()
    val date : LiveData<Long> = _date

    fun onNameChanged(nm : String) {
        _name.value = nm
    }

    fun onAmountChanged(amt : String) {
        _amount.value = amt.toDouble()
    }

    fun onDateChanged(dt : String) {
        _date.value = System.currentTimeMillis()
    }

    fun onSave() {
        viewModelScope.launch(Dispatchers.IO) {
            daoExpense?.saveExpense(
                Expense(
                    nm = name.value.toString(),
                    amt = amount.value ?: 0.0,
                    dt = date.value ?: 0L
                )
            )
        }
    }

    fun setExpenseDao(dao : ExpenseDao) {
        daoExpense = dao
    }
}