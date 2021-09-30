package com.aniruddha.kudalkar.kotlinbasics.nullability

import java.util.*

private fun demo1() {
    var dt: Date? = null // it can be null or non null

    if(System.currentTimeMillis() > 5988) { // random condition
        dt = Date()
    }

    // you null pointer error

    // if dt is null
    // please throw error and terminate application
    println("Time is ${dt!!.time}") //  backward compatibility

    //in below line you are saying, if dt is
    // non null then and only then call method or member from it
    println("Time is ${dt?.time}") // you handled null // feature of kotlin

    if(dt != null) { // you are not needing this condition
        println("Time is ${dt.time}")
    }
}

fun main() {

}