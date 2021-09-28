package com.aniruddha.kudalkar.kotlinbasics.basics

fun simple(): Int { // How to return value ?  returning int
    return 10
}

fun addition(
    num1: Int,
    num2: Int
): Int { // How to pass parameters and return ? accepting two parameters and returning int
    return num1 + num2
}

fun rtnTyp(): Unit { // What is void ? default return type is Unit = void in java
    println("Just Call")
}

fun main() {
    val dt = simple()
    println("Dt is $dt")
    println("Addition is ${addition(12, 3)}")
    rtnTyp()
}