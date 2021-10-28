package com.aniruddha.kudalkar.sqliteroombasics.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

// class represents the operations

@Dao
interface DealerDao {

    @Insert
    fun createNewDealer(dlr : Dealer)

    @Query("select * from dealer")
    fun findAllDealers() : List<Dealer>
}