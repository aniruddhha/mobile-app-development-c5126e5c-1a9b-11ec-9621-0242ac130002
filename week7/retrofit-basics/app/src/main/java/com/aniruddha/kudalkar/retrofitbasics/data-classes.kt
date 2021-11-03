package com.aniruddha.kudalkar.retrofitbasics

data class ReqResSupport(
    var url : String,
    var text : String
)

data class ReqResUser(
    var id : Int,
    var email  : String,
    var first_name : String,
    var last_name : String,
    var avatar : String
)

data class ReqResMain(
    var page : Int,
    var per_page : Int,
    var total : Int,
    var total_pages:Int,
    var data : List<ReqResUser>,
    var support : ReqResSupport
)

data class RegUser(
    val email : String,
    val password : String
)

data class RegResponse(
    val id : Int,
    val token : String
)