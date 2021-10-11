package com.aniruddha.kudalkar.jetpackapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class Friend(
    val icon : Int,
    val name : String,
    val mobile : String,
    val handle : String
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}