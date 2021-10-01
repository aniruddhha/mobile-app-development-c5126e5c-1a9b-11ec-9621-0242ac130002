package com.aniruddha.kudalkar.kotlinbasics.cmpobj

class DbConnector {
    companion object  {
        val url = "http://abc.com"
        val userName = "acc"
        val PASSWORD = "acbv"
    }
}

fun main() {
    val dc = DbConnector() // not needed

    println("Url - ${DbConnector.url}")
    println("User Name - ${DbConnector.userName}")
    println("Password - ${DbConnector.PASSWORD}")
}