package com.aniruddha.kudalkar.sqliteroombasics.db

import com.aniruddha.kudalkar.sqliteroombasics.db.Dealer

interface DealerDao {

    fun createNewDealer(dlr : Dealer)

    fun findAllDealers()

    fun findDealerById(id : Long)

    fun updateDealerMobile(dlr : Dealer)
}