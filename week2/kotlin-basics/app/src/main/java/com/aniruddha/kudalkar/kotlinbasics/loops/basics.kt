package com.aniruddha.kudalkar.kotlinbasics.loops

fun demo1() {
//    val i = 0
//    val j = 10

    for (i in 1..10) { // count based
        println("i = $i")
    }

    for (i in 10.downTo(0).step(3)) { // normal
        println("i = $i")
    }

    for (i in 10 downTo 0 step 3) { // infix one
        println("i = $i")
    }
}

fun demo2() {
    val nums = intArrayOf(56, 89, 23, 78, 65, 20, 12, 103)

    for (i in nums.indices) {
        println(" index = $i, value = ${nums[i]}")
    }

    for (value in nums) {
        println("value = $value")
    }

    for ((index, value) in nums.withIndex()) {
        println("Index ${index}, Value = $value")
    }

    for (i in 0 until nums.size - 2) {
        println(i)
    }
}

fun main() {
    demo2()
}