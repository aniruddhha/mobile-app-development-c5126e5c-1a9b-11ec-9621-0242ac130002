package com.aniruddha.kudalkar.kotlinbasics.basics

fun uploadFiles(
    files: Array<String>,
    fn: (st: String) -> Unit
) {

    // I want to do processing, i.e. uploading files
    // after processing I want call function
    // just to notify status of processing

    // notification for starting the processing ->
    fn("starting")
    for ( file in files) {
        // we do some processing
        // during processing we need to notify
        Thread.sleep(1000) // not recommended to use
        // i have used this sleep, just to simulate to delay
        fn(file)
    }
    // after completion on notify status ->
    fn("completed")
}

fun demo1() {
    // fn1 can hold the value of type function whose shape is like
    // zero parameters and returning integer
    // i.e. shape = () -> Int = how many params and what is return type
    // val nm : shape = actual function as per shape

    val fn1: () -> Int = fun(): Int {
        return 10
    }

    val fn2: () -> Int = { -> 10 } // same function but representation is different
    val fn3: () -> Int = { 10 }

    val fn4: (st: String) -> Int = fun(st: String): Int {
        return st.length
    }

    val fn5: (st: String) -> Int = { st: String -> st.length }
    val fn6: (st: String) -> Int = { st -> st.length }
    val fn7: (st: String) -> Int = { st -> 10 }
    val fn8: (st: String) -> Int = { 10 }

    val fn9: (st: String, dt: Int, prc: Double) -> Int =
        fun(st: String, dt: Int, prc: Double): Int {
            return 10
        }
    val fn10: (st: String, dt: Int, prc: Double) -> Int = { st, dt, prc  -> 10  }
    val fn11: (st: String, dt: Int, prc: Double) -> Int = { _, dt, _ ->  10 * dt  }
}

fun demo2() {

    val files = arrayOf("ajdf", "asdslfh", "akjfh", "alfj", "sdkdfkh", "sdldf", "sdlkfkdj")

    val fn1 = fun(file : String) {
        println("File Uploaded - $file")
    }
    uploadFiles(files, fn1)
    uploadFiles(files, fun(file : String) {
        println("File Uploaded - $file")
    })

    val fn2 = { file : String -> println(file)  }
    uploadFiles(files, fn2)
    uploadFiles(files, { file : String -> println(file)  })
    uploadFiles(files) { file : String ->
        println(file)
    }
    uploadFiles(files) {
        println(it)
    }
}

fun main() {
    demo2()
}