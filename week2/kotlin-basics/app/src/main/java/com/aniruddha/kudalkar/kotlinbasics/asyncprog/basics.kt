package com.aniruddha.kudalkar.kotlinbasics.asyncprog

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

private fun demo1() {
    println()
    print("one ")
    print("two ")
//    print("three ")
//    print("four ")

    Thread {
        print("three ")
        print("four ")
    }.start()

    print("five ")
    print("six ")
    println()
}

private fun demo2() {
    runBlocking { //  hey thread  I am blocking for executing below co-routines
        println("one")
        println("two")

        launch {
            println("three")
            println("four")
        }

        launch {
            println("five")
            println("six")
        }

        launch {
            println("seven")
            println("eight")
        }
//        delay(1500)
        println("nine")
        println("ten")
    }
}

private fun demo3() {
    runBlocking {
        launch { demoCode() }
    }
}

private suspend fun demoCode() {
    for(i in 1..100) {
        delay(1000) // suspended function
        println(i)
    }
}

fun main() {
    demo3()
}