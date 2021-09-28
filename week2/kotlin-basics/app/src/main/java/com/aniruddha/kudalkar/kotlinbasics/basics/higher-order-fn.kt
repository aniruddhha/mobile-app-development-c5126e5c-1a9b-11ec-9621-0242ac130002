package com.aniruddha.kudalkar.kotlinbasics.basics

fun main() {
    // fn1 can hold the value of type function whose shape is like
    // zero parameters and returning integer
    // i.e. shape = () -> Int = how many params and what is return type
    // val nm : shape = actual function as per shape

    val fn1: () -> Int = fun(): Int {
        return 10
    }

    val fn2: () -> Int = { -> 10 } // same function but representation is different

    val fn3: (st: String) -> Int = fun(st: String): Int {
        return st.length
    }

    val fn4: (st: String) -> Int = { st: String -> st.length }

    val fn5: (st: String, dt: Int, prc: Double) -> Int =
        fun(st: String, dt: Int, prc: Double): Int {
            return 10
        }
    val fn6: (st: String, dt: Int, prc: Double) -> Int = { st, dt, prc  -> 10  }
}