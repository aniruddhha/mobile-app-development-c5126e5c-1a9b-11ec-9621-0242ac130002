package com.aniruddha.kudalkar.kotlinbasics.operators


fun demo1() {
    var i = 10
    var j = 20

    println("i + j ${i + j}")
    println("i - j ${i - j}")
    println("i * j ${i * j}")
    println("i / j ${i / j}")
    println("i == j ${i == j}")
    println("i != j ${i != j}")
    println("i++ ${ i++}")
    println(" --i ${ --i}")
    println("i & j ${ i.and(j)}")
    println("i & j ${ i and j}")
    println("i | j ${ i or j}")
    println("i ^ j ${ i xor j}")
    println("i && j ${ (i > j) && (i > 50) }")
    println("i || j ${ (i < j) || (i > 10) }")
    println("i <= j ${ (i <= j)}")
    println("i >= j ${ (i >= j)}")
    println("Not ${ !(i == j)}")
    println("Not ${ (i == j).not()}")
}

fun main() {
    demo1()
}