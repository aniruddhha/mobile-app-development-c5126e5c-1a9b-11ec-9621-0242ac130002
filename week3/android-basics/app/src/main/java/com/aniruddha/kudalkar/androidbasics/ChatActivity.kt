package com.aniruddha.kudalkar.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_chat)

    }

    private fun justTextViewChat() {
        val llChats = findViewById<LinearLayout>(R.id.llChats)
        val et = findViewById<EditText>(R.id.etCht)

        findViewById<TextView>(R.id.btSnd).setOnClickListener {
            llChats.addView(
                TextView(this).apply {
                    text = et.text.toString()
                    textSize = 24f
                }
            )
        }
    }

    private fun demoChats() {
        val llChats = findViewById<LinearLayout>(R.id.llChats)
//        val ctx: Context = this // this points to current object of ChatActivity
//        val ctx1: Context = ChatActivity()
        for (i in 0..100) {
            val cht = TextView(this)
            cht.text = "Hello World --> $i"
            llChats.addView(cht)
        }
    }
}
private fun inheritance() {
    open class Animal
    class Tiger : Animal()

    val an: Animal = Animal()
    val tg: Tiger = Tiger()
    val anTg: Animal = Tiger()
}
