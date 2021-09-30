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

private fun demo2() {
    var dt: Array<String>? = null

    if(System.currentTimeMillis() > 5988) { // random condition
        dt = arrayOf("sdlkfjsldkf", "slkfkdsdklf", "dslfjslkdfj")
    }

    val ln = if(dt != null) dt.size else -3

    // If the expression to the left of ?: is not null,
    // the Elvis operator returns it, otherwise
    // it returns the expression to the right.
    val ln1 = dt?.size ?: -1 // ?: is elvis operator , kotlins way

    println("Length is ${ln}")
    println("Length is ${ln1}")
}
fun main() {

}