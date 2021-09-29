package com.aniruddha.kudalkar.kotlinbasics.controlflow.conditionals

import java.util.*


// for taking input you can use
// - scanner from java
// - use kotlins native feature readLine -> you read string

fun demo1() {
    println("Enter The OS : ")
    val os = readLine() // take input from user
    var st = ""
    if(os.equals("10")) {
        println("Oreo")
        st = "oreo"
    } else if (os.equals("9")) {
        println("Pie")
        st = "pie"
    } else {
        println("Android")
        st = "android"
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

fun demo3() {
    println("Enter Name")
    val nm = readLine()

    val info = if(nm.equals("android")) 11 else 30
    val dt = when(nm){
         "123" -> 123
          else -> 23
    }

    println("Info $info, Dt $dt")
}

fun demo4() {
    val safeNums = intArrayOf(45, 89, 50)

    val `when` = 10
    println("When is ${`when`}")

    val sc = Scanner(System.`in`)
    println("Enter your Number")
    val num = sc.nextInt()

    when(num) {
        in 1..10 -> println("it is in range")
        !in 96..100 -> println("it is not in safe range")
        in safeNums -> println("it is in safe range")
        else -> println("invalid number")
    }
}

fun main() {
    demo4()
}