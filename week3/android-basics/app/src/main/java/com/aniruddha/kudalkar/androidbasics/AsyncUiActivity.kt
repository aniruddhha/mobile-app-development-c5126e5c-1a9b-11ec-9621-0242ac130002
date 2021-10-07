package com.aniruddha.kudalkar.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import org.w3c.dom.Text

class AsyncUiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_ui)
        val txtCnt = findViewById<TextView>(R.id.txtCnt)

        usingCustomScope(txtCnt)
    }

    private fun usingCustomScope(txt: TextView) {
        val scp = CoroutineScope(Job() + Dispatchers.IO)
        scp.launch {
            (60 downTo 1).map {
                delay(1000)
                runOnUiThread {
                    txt.text = "$it"
                }
            }
        }
    }

    private fun usingGlobalScope(txt: TextView) {
        GlobalScope.launch { // global scopes you have to avoid
            (60 downTo 1).map {
                delay(1000)
                runOnUiThread {
                    txt.text = "$it"
                }
            }
        }
    }
}