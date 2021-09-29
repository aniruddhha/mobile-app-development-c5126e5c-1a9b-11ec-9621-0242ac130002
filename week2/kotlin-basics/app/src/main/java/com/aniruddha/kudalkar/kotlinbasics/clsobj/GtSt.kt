package com.aniruddha.kudalkar.kotlinbasics.clsobj

class GtSt(
    private var xPos : Int,
    private var yPos : Int
) {
    var x : Int
        get() = this.xPos
        set(value) { this.xPos = value }

    var y: Int
        get() = this.yPos
        set(value) { this.yPos = value }
}

fun main() {
    val gt1 = GtSt(10, 56) // `get()` is getting callled
    gt1.x = 10 // `set(value)` is getting called
    println("${gt1.x}")

}