package com.aniruddha.kudalkar.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_chat)

        leftRightChatBubbles()
    }

    private fun leftRightChatBubbles()  {
        val llChats = findViewById<LinearLayout>(R.id.llChats)
        val et = findViewById<EditText>(R.id.etCht)

        val inflater = LayoutInflater.from(this)
        val vwRt = inflater.inflate(R.layout.chat_right_item, llChats, false)
        vwRt.findViewById<TextView>(R.id.txRtUsr).text = "Abc"
        vwRt.findViewById<TextView>(R.id.txRtTm).text = "10:00 AM"
        vwRt.findViewById<TextView>(R.id.txRtMsg).text = "WhatsApp Messenger, or simply WhatsApp, is an American freeware, cross-platform centralized instant messaging (IM) and voice-over-IP (VoIP) service owned by Facebook, Inc.[12] It allows users to send text messages and voice messages,[13] make voice and video calls, and share images, documents, user locations, and other content.[14][15] WhatsApp's client application runs on mobile devices but is also accessible from desktop computers, as long as the user's mobile device remains connected to the Internet while they use the desktop app.[16] The service requires a cellular mobile telephone number to sign up.[17] In January 2018, WhatsApp released a standalone business app targeted at small business owners, called WhatsApp Business, to allow companies to communicate with customers who use the standard WhatsApp client"
        llChats.addView(vwRt)

        val vwLt = inflater.inflate(R.layout.chat_left_item, llChats, false)
        vwLt.findViewById<TextView>(R.id.txLtUsr).text = "Pqr"
        vwLt.findViewById<TextView>(R.id.txLtTm).text = "11:00 AM"
        vwLt.findViewById<TextView>(R.id.txLtMsg).text = "WhatsApp Messenger, or simply WhatsApp, is an American freeware, cross-platform centralized instant messaging (IM) and voice-over-IP (VoIP) service owned by Facebook, Inc.[12] It allows users to send text messages and voice messages,[13] make voice and video calls, and share images, documents, user locations, and other content.[14][15] WhatsApp's client application runs on mobile devices but is also accessible from desktop computers, as long as the user's mobile device remains connected to the Internet while they use the desktop app.[16] The service requires a cellular mobile telephone number to sign up.[17] In January 2018, WhatsApp released a standalone business app targeted at small business owners, called WhatsApp Business, to allow companies to communicate with customers who use the standard WhatsApp client"
        llChats.addView(vwLt)
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
