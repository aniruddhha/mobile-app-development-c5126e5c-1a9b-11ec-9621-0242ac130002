package com.aniruddha.kudalkar.kotlinbasics.cmpobj

class DbConnector {

    private val nm = "nnn"
    val dbNm = "nnn"

    companion object {
        val url = "http://abc.com"
        val userName = "acc"
        val PASSWORD = "acbv"

        fun crackPassword() {
            //nm = 10 private member of class
            // dbNm = "" nothing is accessible from class

            println("Accessing URL $url")
        }
    }

    fun connect() {
        println("Accessing URL $url")

        crackPassword()
    }
}

fun main() {
    val dc = DbConnector() // not needed
    dc.connect()

    println("Url - ${DbConnector.url}")
    println("User Name - ${DbConnector.userName}")
    println("Password - ${DbConnector.PASSWORD}")
    DbConnector.crackPassword()
}