package com.aniruddha.kudalkar.kotlinbasics.typeandcast

private fun demo1() {
    val age = 20
    val str = "hello"
    println(" is str a String ${str is String}" )
    println(" is str not a String ${str !is String}" )
    println(" is Age a Integer ${age is Int}")
}

private fun demo2() {
    //    val num1 = "100" as Int // as is unsafe cast operator
//    val num2 = "200" as Int // unsafe wont work here

    val stNum1 = "122"
    val num1 = stNum1.toInt()
    val stNum2 = "2323"
    val num2 = stNum2.toInt()

    val chr = 'c'
    println("Ascii  ${chr.code}")

    println("Num1 $num1, Num2 $num2")
    println("Addition is ${num1 + num2}")
}



fun main() {
    demo2()
}