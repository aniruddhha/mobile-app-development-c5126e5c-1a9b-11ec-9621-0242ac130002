package com.aniruddha.kudalkar.sqlitecasestudy.db

import androidx.room.*

@Dao
interface ExpenseDao {

    @Insert
    fun saveExpense(exp : Expense)

    @Update
    fun deleteExpense(exp : Expense)

    @Query("select * from expense")
    fun findAllExpenses() : List<Expense>
}