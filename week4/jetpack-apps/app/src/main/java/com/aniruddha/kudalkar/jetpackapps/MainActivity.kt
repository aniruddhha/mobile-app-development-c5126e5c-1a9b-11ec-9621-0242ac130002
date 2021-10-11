package com.aniruddha.kudalkar.jetpackapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val friends = listOf<Friend>(
            Friend(R.drawable.ic_android, "abc", "98898798798", "@abc"),
            Friend(R.drawable.ic_android, "pqr", "24234654", "@pqr"),
            Friend(R.drawable.ic_android, "lmn", "423437456", "@lmn"),
            Friend(R.drawable.ic_android, "abc", "98898798798", "@abc"),
            Friend(R.drawable.ic_android, "pqr", "24234654", "@pqr"),
            Friend(R.drawable.ic_android, "lmn", "423437456", "@lmn"),Friend(R.drawable.ic_android, "abc", "98898798798", "@abc"),
            Friend(R.drawable.ic_android, "pqr", "24234654", "@pqr"),
            Friend(R.drawable.ic_android, "lmn", "423437456", "@lmn"),Friend(R.drawable.ic_android, "abc", "98898798798", "@abc"),
            Friend(R.drawable.ic_android, "pqr", "24234654", "@pqr"),
            Friend(R.drawable.ic_android, "lmn", "423437456", "@lmn"),Friend(R.drawable.ic_android, "abc", "98898798798", "@abc"),
            Friend(R.drawable.ic_android, "pqr", "24234654", "@pqr"),
            Friend(R.drawable.ic_android, "lmn", "423437456", "@lmn"),Friend(R.drawable.ic_android, "abc", "98898798798", "@abc"),
            Friend(R.drawable.ic_android, "pqr", "24234654", "@pqr"),
            Friend(R.drawable.ic_android, "lmn", "423437456", "@lmn"),Friend(R.drawable.ic_android, "abc", "98898798798", "@abc"),
            Friend(R.drawable.ic_android, "pqr", "24234654", "@pqr"),
            Friend(R.drawable.ic_android, "lmn", "423437456", "@lmn"),Friend(R.drawable.ic_android, "abc", "98898798798", "@abc"),
            Friend(R.drawable.ic_android, "pqr", "24234654", "@pqr"),
            Friend(R.drawable.ic_android, "lmn", "423437456", "@lmn"),Friend(R.drawable.ic_android, "abc", "98898798798", "@abc"),
            Friend(R.drawable.ic_android, "pqr", "24234654", "@pqr"),
            Friend(R.drawable.ic_android, "lmn", "423437456", "@lmn"),Friend(R.drawable.ic_android, "abc", "98898798798", "@abc"),
            Friend(R.drawable.ic_android, "pqr", "24234654", "@pqr"),
            Friend(R.drawable.ic_android, "lmn", "423437456", "@lmn"),Friend(R.drawable.ic_android, "abc", "98898798798", "@abc"),
            Friend(R.drawable.ic_android, "pqr", "24234654", "@pqr"),
            Friend(R.drawable.ic_android, "lmn", "423437456", "@lmn"),Friend(R.drawable.ic_android, "abc", "98898798798", "@abc"),
            Friend(R.drawable.ic_android, "pqr", "24234654", "@pqr"),
            Friend(R.drawable.ic_android, "lmn", "423437456", "@lmn"),

        )

        val rcFrnds = findViewById<RecyclerView>(R.id.recFrnds)
//        rcFrnds.layoutManager = GridLayoutManager(this, 2)
        rcFrnds.layoutManager = LinearLayoutManager(this)
        rcFrnds.adapter = FriendAdapter(this, friends)
    }
}