package com.aniruddha.kudalkar.expensemanager

import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class LocalDataSource
@Inject
constructor (
    val rds : RemoteDataSource
) {

    // this class will read the data from
    // local database i.e. sqlite
    fun loadData() = rds.fetchData()
}

@ViewModelScoped
class RemoteDataSource
@Inject
constructor()  {

    // technically this class will pull the data from
    // remote server and store it is sqlite

    fun fetchData() = listOf(
        Expense(1, "Tea", 10.0, R.drawable.ic_plc),
        Expense(2, "Coffee", 15.0, R.drawable.ic_plc),
        Expense(3, "Vada Pav", 15.0, R.drawable.ic_plc),
        Expense(4, "Cold Coffee", 25.0, R.drawable.ic_plc)
    )
}