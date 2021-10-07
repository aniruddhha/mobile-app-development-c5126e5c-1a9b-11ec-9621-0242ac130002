package com.aniruddha.kudalkar.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.*

class AsyncUiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_ui)

        val txtCnt = findViewById<TextView>(R.id.txtCnt)

        GlobalScope.launch {
            (60 downTo 1).map {
                delay(1000)
                runOnUiThread {
                    txtCnt.text = "$it"
                }
            }
        }
    }
}