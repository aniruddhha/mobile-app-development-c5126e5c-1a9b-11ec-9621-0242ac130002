package com.aniruddha.kudalkar.sqlitecasestudy.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "expense")
data class Expense(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "exp_id")
    var id : Long = 0,

    @ColumnInfo(name = "exp_nm")
    var nm : String,

    @ColumnInfo(name = "exp_amt")
    var amt : Double,

    @ColumnInfo(name = "exp_dt")
    var dt : Long
)