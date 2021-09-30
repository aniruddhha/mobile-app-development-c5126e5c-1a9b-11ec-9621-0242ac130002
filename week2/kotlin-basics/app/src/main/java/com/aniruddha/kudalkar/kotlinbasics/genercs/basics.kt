package com.aniruddha.kudalkar.kotlinbasics.genercs

import java.util.Date

private class Box<T, U>(
    val t : T,
    val u : U
) {
    fun getDt() : T {
        return t
    }

    fun getDu() : U {
        return u
    }
 }

fun main() {
    val box1: Box<Int, Double> = Box(10, 56.9)
    box1.getDt()
    val box2 = Box<String, Boolean>("abc", true)
    val box3 = Box('c', Date())
}