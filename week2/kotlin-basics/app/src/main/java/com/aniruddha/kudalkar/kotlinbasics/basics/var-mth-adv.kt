package com.aniruddha.kudalkar.kotlinbasics.basics

typealias SimpleFunction = (n : Int) -> String

private fun someObj() = object { // inline function returning object
    var dt = 10
    var os = "android"
}

private fun objDemo() {
    val ob = object {
        var dt = 10
        var os = "android"
    }

    var ob1 = someObj()
//    ob1.dt

    println(" Os ${ob.dt}")
}

private fun fnDemo() {
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

private fun outer(): (n1: Int) -> String {
    /*
        if variable holds integer value its type is Int, so
        if variable holds function value, what its type would be ?
     */

    return fun(n: Int): String {
        return "abc"
    }
}

private fun outer2(): SimpleFunction { // instead of writing complete (n : Int) -> String just write SimpleFunction
    return fun ( n : Int ) : String {
        return "aliaadfdasdfsafsafdsafs"
    }
}

fun main() {
    fnDemo()

    val fn = outer()
    val str1 = fn(10)
    val str2 = fn.invoke(10)

    println(fn) // what is output ?
    println(str1) // what is output ?
    println(str2) // what is output ?
}