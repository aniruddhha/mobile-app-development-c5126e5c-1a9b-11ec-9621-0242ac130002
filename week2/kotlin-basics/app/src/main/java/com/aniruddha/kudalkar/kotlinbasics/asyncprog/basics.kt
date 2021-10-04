package com.aniruddha.kudalkar.kotlinbasics.asyncprog

import kotlinx.coroutines.*

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

private fun demo4() {
    runBlocking {
        demoCoScp()
    }
}

private suspend fun demoCoScp() {
    coroutineScope {
        println("one")
        println("two")
        launch {
            println("three")
            println("four")
        }
        println("five")
        println("six")
    }
}

private fun job1() {
    runBlocking {

        val job = launch {
            delay(1500)
            println("World")
        }
        println("hello")
//        job.cancel("some message")
//        job.join() // until job is complete wait here

        job.cancelAndJoin()
        println("job completed")
    }
}

private fun job2() {
    runBlocking {
        launch { // context of the parent, main runBlocking coroutine
            println("main runBlocking      : I'm working in thread -> ${Thread.currentThread().name}")
        }
        launch(Dispatchers.Default) { // will get dispatched to DefaultDispatcher
            println("Default               : I'm working in thread ->  ${Thread.currentThread().name}")
        }
    }
}

fun main() {
    job2()
}