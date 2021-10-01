package com.aniruddha.kudalkar.kotlinbasics.exception

import java.lang.NumberFormatException

private class InvalidAgeException( // custom exception
    private val age : Int
) : Exception() {
    override fun getLocalizedMessage(): String {
        return "Entered Age $age is invalid, Age must less than 60"
    }
}

private class InvalidPasswordException(
    private val password : String
) : Exception() {
    override fun getLocalizedMessage(): String {
        return "Your entered password $password, is not satisfying criteria"
    }
}

private fun demo1() {
    val age = readLine()?.toInt() ?: 0 // if readLine is null return 0
    // sdlsfjsdlfj
    //a;fjsdlf
    //sd;l;slgk

    if(age > 60)
        throw InvalidAgeException(age)
}

private fun demo2() {
    println("Enter Age")
    readLine()?.let {
        if(it.toInt() > 60)
            throw Exception("something unwanted happened")
        else println("its good")
    }

    println("Enter Password (No. $ % ^ &)")
    val pass = readLine()
    pass?.let {
        if(it.contains("$")) {
            throw InvalidPasswordException(it)
        } else println("its good")
    }
}

private fun demo3() {
    /*println("Enter Age : ")
    val age = readLine()?.toInt() // to int can not convert some non numerical string to int
    println("Executed this line")*/

    try {
        // execution
        var age1 = readLine()?.toInt() // throw NumberFormatException()
    } catch (e : NumberFormatException) {
        // exception has handled at this line
        println("You are not entering numbers")
        var age1 = 0
    } finally {
        // releasing
        // resource cleanup
            // releasing heavy resources

      println("Exception in there or not, this be getting executed")
    }
    println("Executed this line")
}

private fun demo4() {
    println("Enter Age : ")
    val age = try { readLine()?.toInt()  } catch (e : Exception) { 0 }
    println("You Entered : $age")
}

private fun demo5() : Nothing {

    val age = readLine()?.toInt() ?: throw Exception()

    throw Exception()
}

fun main() {
    demo4()
}