package com.aniruddha.kudalkar.kotlinbasics.clsobj

private class GtSt(
    private var xPos : Int
) {
    var x : Int
        get() = this.xPos
        set(value) { this.xPos = value }
}

fun main() {
    val gt1 = GtSt(10)
    gt1.x = 10

    println("X - ${gt1.x}")

    // from visibility.kt
    val a = Abc()
    data = 50;

    val sv = Visibility()
    sv.v = 10
    sv.z = 56

    val sb = SubVisibility()
    sb.v = 10
    sb.z = 10
}

private class SubVisibility : Visibility() {
     fun sb() {
         y = 25
     }
}


