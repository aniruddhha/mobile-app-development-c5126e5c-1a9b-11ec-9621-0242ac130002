package com.aniruddha.kudalkar.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LifecycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        Log.i("ani", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ani", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ani", "onResume")
    }

    override fun onPause() {
        Log.i("ani", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("ani", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("ani", "onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.i("ani", "onRestart")
        super.onRestart()
    }
}