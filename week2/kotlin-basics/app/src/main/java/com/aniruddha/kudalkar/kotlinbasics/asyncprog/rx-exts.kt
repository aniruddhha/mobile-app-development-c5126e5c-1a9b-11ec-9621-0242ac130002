package com.aniruddha.kudalkar.kotlinbasics.asyncprog

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import io.reactivex.rxjava3.subjects.BehaviorSubject
import io.reactivex.rxjava3.subjects.PublishSubject
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import javax.security.auth.Subject

/*
implementation 'io.reactivex.rxjava3:rxkotlin:3.0.0'
implementation 'io.reactivex.rxjava3:rxandroid:3.0.0'

 */
private fun obs1() {
    // cold and hot
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

private fun obs2() {

    val atBl = AtomicBoolean(true)

    Observable.interval(1300, TimeUnit.MILLISECONDS)
//            .subscribeOn(Schedulers.computation())
//        .observeOn(Schedulers.io())
        .takeWhile { atBl.get() }
         // interval operator will work until cond is true
            .doOnNext {
                atBl.set(it < 10)
            }
//        .doOnError {  }
//        .doOnComplete {  }
        .subscribe()


        while (atBl.get()){
            println(atBl.get())
        } // -> there operator which continue until condition is met


    /*Observable.interval(1300, TimeUnit.MILLISECONDS)
        .subscribe(
            { }, // doOnNext
            { },  // doOnError
            { } // doOnComplete
        )*/
}

private fun obs3() {
    val obs = Observable.just("android", "iOS", "linux")

    obs.map { it.uppercase() } // transform item emitted by observable to another item
        .doOnNext { println(it) }
        .subscribe()

    obs.flatMap { Observable.just(it.uppercase()) } // transform item emitted by observable to another observable
        .doOnNext { println(it) }
        .subscribe()


    while (true) { }
}

fun main() {
    obs3()
}