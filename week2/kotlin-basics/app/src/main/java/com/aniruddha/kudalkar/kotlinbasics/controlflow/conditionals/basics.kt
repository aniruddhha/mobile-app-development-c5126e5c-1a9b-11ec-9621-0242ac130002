package com.aniruddha.kudalkar.kotlinbasics.controlflow.conditionals


// for taking input you can use
// - scanner from java
// - use kotlins native feature readLine -> you read string

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

    val num = 10

    when(num) {
        in 1..10 -> println("it is in range")
        !in 96..100 -> println("it is not in safe range")
        in safeNums -> println("it is in safe range")
        else -> println("invalid number")
    }
}

fun main() {
}