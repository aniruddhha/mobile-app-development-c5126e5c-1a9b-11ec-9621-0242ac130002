package com.aniruddha.kudalkar.jetpacknavigationgraph.stlthm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.aniruddha.kudalkar.jetpacknavigationgraph.R

class StlThmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stl_thm)

        val drawable = ContextCompat.getDrawable(this, R.drawable.ic_blb_off)

        val srt = resources.getString(R.string.app_name)

        val col = ContextCompat.getColor(this, R.color.smTxBk)
    }
}