package com.aniruddha.kudalkar.kotlinbasics.clsobj

class GtSt(
    private var xPos : Int
) {
    var x : Int
        get() = this.xPos
        set(value) { this.xPos = value }
}

fun main() {
    val gt1 = GtSt(10)
    gt1.x = 10
}