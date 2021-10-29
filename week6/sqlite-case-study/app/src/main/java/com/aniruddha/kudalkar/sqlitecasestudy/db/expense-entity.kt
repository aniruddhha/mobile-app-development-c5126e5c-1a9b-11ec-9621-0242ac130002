package com.aniruddha.kudalkar.sqlitecasestudy.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "expense")
data class Expense(

    @PrimaryKey(autoGenerate = true)
    var id : Long = 0,

    var nm : String,
    var amt : Double,
    var dt : Long
)