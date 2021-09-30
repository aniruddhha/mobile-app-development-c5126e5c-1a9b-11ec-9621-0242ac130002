package com.aniruddha.kudalkar.kotlinbasics.clsobj

class Dv(
    private val x: Int,
    private val y: Int
) {
    //Returns a string representation of the object.
    override fun toString() = " x = $x, y = $y "

    fun printXAndY(): String {
        return " x = $x, y = $y "
    }

    override fun equals(other: Any?): Boolean {
        val oth = other as Dv // type casting
        return (this.x == oth.x) && (this.y == oth.y)
    }
}

fun main() {
    // obj = values of state
    // dv1 = values of x & y
    // dv2 = values of x & y

    val dv1 = Dv(10, 465)

    val dv2 = Dv(20, 465)

    println(dv1.equals(dv2))
    println(dv2.equals(dv1))
}