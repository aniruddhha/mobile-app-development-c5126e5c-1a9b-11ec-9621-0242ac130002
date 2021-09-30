package com.aniruddha.kudalkar.kotlinbasics.genercs

import java.util.Date

private class Box<in T, out U>(
    private val t : T,
    private var u : U
) {

    fun calc(t : T) : U  { // t used as input to the function
        if( (t is Int) && (u is Int)) {
            u = (t * t) as U
            return u
        }
        return  u
    }

    fun getDu() : U { // u used to output/return from the function
        return u
    }
 }

fun main() {
    val box1: Box<Int, Double> = Box(10, 56.9)
    val box2 = Box<String, Boolean>("abc", true)
    val box3 = Box('c', Date())

    println(Box(10, 2).calc(5))
}