package com.aniruddha.kudalkar.kotlinbasics.clsobj

/*
It is not unusual to create classes whose main purpose is to hold data.
In such classes, some standard functionality and some utility functions are often
mechanically derivable from the data.
In Kotlin, these are called data classes and are marked with data
 */
private data class MsInfo(
    val nm: String = "abc",
    val age: Int = 20,
    var isNri : Boolean = false
) 

fun main() {
    val d1 = MsInfo()
    println(d1.toString())
}