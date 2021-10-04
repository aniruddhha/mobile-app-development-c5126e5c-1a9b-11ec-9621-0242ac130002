package com.aniruddha.kudalkar.kotlinbasics.asyncprog

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers

/*
implementation 'io.reactivex.rxjava3:rxkotlin:3.0.0'
implementation 'io.reactivex.rxjava3:rxandroid:3.0.0'

 */
private fun obs1() {
    val obs = Observable.create<String> {
        // this loop is simulation of going to fb
        // and pulling data back
        for( i in 1..1000) {
            // below line will simulate, connectivity step like
            // connected, processing and disconnected etx
            it.onNext(i.toString()) // progress //  I am going to send string type of type of data

            if(i == 999) {
                it.onError(Throwable("Example Error")) // simulating error
            }
        }
        it.onComplete() //  success
    }

    obs
        .observeOn(AndroidSchedulers.mainThread()) // kindly observer on main thread
        .subscribeOn(Schedulers.computation()) // subscribe on worker thread
        .doOnNext { str -> println(str) } // it will be called when observer calls onNext
        .doOnError { th -> println(th.toString()) } // it will be called when observer calls onError
        .doOnComplete { println("Processing completed") } // it will be called when observer calls onComplete
        .subscribe()
}

fun main() {
    obs1()
}