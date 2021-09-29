package com.aniruddha.kudalkar.kotlinbasics.controlflow.conditionals


// for taking input you can use
// - scanner from java
// - use kotlins native feature readLine

fun demo1() {
    println("Enter The OS : ")

    val os = readLine() // take input from user

    if(os.equals("10")) {
        println("Oreo")
    } else if (os.equals("9")) {
        println("Pie")
    } else {
        println("Android")
    }
}

fun demo2() {
    println("Enter The OS : ")
    val os = readLine() // take input from user
    when(os) {
        "10" -> println("Oreo")
        "9" -> print("Pie")
        "8", "7" -> println("Jelly Bean")
        else -> print("android")
    }
}

fun main() {

}