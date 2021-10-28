package com.aniruddha.kudalkar.sqliteroombasics.db

data class Dealer(
    var id : Long,
    var dlNm : String,
    var mobile : String,
    var period : Int,
    var isActive : Boolean
)
