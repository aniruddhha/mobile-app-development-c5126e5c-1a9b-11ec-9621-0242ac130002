package com.aniruddha.kudalkar.kotlinbasics.basics

fun someObj() = object { // inline function returning object
    var dt = 10
    var os = "android"
}

fun objDemo() {
    val ob = object {
        var dt = 10
        var os = "android"
    }

    var ob1 = someObj()
//    ob1.dt

    println(" Os ${ob.dt}")
}

fun fnDemo() {
    val dt: Int = 10 // accessible in inner function

    fun hi() { // inner named function
        println(" Dt is $dt")
    }

    val fn: (num1: Int, num2: Int) -> Int = fun(n1: Int, n2: Int): Int { // inner anonymous function
        val amt = 45 // accessible only inside this function
        return n1 * n2 + dt + amt
    }

//    println(amt)

    hi()
    println(fn)
    println(fn(10, 20))
}

fun outer(): (n1: Int) -> String {
    /*
        if variable holds integer value its type is Int, so
        if variable holds function value, what its type would be ?
     */

    return fun(n: Int): String {
        return "abc"
    }
}

fun main() {
    fnDemo()

    val fn = outer()
    val str = fn(10)

    println(fn) // what is output ?
    println(str) // what is output ?
}