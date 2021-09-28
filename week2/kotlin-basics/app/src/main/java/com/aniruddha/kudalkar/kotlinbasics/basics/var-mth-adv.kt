package com.aniruddha.kudalkar.kotlinbasics.basics

fun objDemo() {
    val obj =  object {
        var dt = 10
        var os = "android"
    }
    println("Data ${obj.dt} Os ${obj.os}")
}

fun main() {
    objDemo()
}