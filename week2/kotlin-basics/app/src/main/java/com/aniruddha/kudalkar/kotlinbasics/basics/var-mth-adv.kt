package com.aniruddha.kudalkar.kotlinbasics.basics

fun someObj() = object { // inline function returning object
    var dt = 10
    var os = "android"
}

fun main() {

    val ob = object {
        var dt = 10
        var os = "android"
    }

    var ob1 = someObj()
//    ob1.dt

    println( " Os ${ob.dt}")
}