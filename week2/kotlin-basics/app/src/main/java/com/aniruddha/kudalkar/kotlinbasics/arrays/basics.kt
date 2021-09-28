package com.aniruddha.kudalkar.kotlinbasics.arrays

fun demo1() {
    val nums = intArrayOf(1, 98, 2, 78, 63, 52) // static array

    println("0 -> ${nums.get(0)}")
    println("1 -> ${nums[1]}")
    println(nums.contentToString())

    val intNums = IntArray(5) // dynamic array
    intNums[0] = 45
    intNums[1] = 12
    intNums[2] = 9
    intNums[3] = 96
    intNums[4] = 47
//    intNums[5] = 78

    println(intNums.contentToString())
}

fun main() {
    demo1()
}