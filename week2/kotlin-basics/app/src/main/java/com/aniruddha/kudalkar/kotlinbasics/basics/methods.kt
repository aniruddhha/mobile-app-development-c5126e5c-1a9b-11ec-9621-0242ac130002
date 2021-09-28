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

fun nTimes(num: Int, n: Int) = n * num // inline function

fun defaultValues( // indentation would be like this
    num1: Int = 30, // default value
    num2: Int = 20 //  default value
): String {
//    println(" Num1  $num1 Num2 $num2")

    return "Num1 = ${num1}, Num2 = ${num2}"
}


infix fun Char.sq(n: Int) = n * n

fun main() {
    /*val dt = simple()
    println("Dt is $dt")
    println("Addition is " + addition(12, 3))
    println("Addition is ${addition(12, 3)}")
    rtnTyp()
    println("10 3 Times is ${nTimes(10, 3)}")

    println("defaultValues() ${defaultValues()}")
    println("defaultValues(89, 56) ${defaultValues(89, 56)}")
    println("defaultValues(num2 = 4555, num1 = 10) ${defaultValues(num2 = 4555, num1 = 10)}") // named parameters
    println("defaultValues(num2 = 878) ${defaultValues(num2 = 878)}")*/

    println(" Square is ${'1' sq 2}")
    println(" Square is ${'1'.sq(2)}")
}