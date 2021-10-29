package com.aniruddha.kudalkar.sqliteroombasics.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query

@Dao
interface AsyncDealerDao {

    @Delete
    suspend fun deleteDealer( dl : Dealer )

    @Query("select * from dealer where is_active = 1")
    suspend fun findAllActiveDealers() : List<Dealer>
}