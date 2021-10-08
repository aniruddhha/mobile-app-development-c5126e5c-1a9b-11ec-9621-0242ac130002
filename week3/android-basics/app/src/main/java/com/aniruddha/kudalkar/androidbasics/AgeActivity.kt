package com.aniruddha.kudalkar.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CalendarView
import android.widget.TextView
import java.util.*

class AgeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)

        val txt = findViewById<TextView>(R.id.txtAg)
        val cal = findViewById<CalendarView>(R.id.cal)
        cal.setOnDateChangeListener { _, year, month, dayOfMonth ->
            Log.i("@ani", "Selected Date is $dayOfMonth-$month-$year")

            val calObj = Calendar.getInstance()
            calObj.set(year, month, dayOfMonth)
            val selectedMillis = calObj.timeInMillis
            val currentMillis = System.currentTimeMillis()
            val diff = currentMillis - selectedMillis
            val seconds = diff / 1000
            val minutes = seconds / 60
            val hours = minutes / 60
            val days = hours / 24
            val years = days / 365

            txt.text = "Age : $years years"
            Log.i(
                "@ani",
                "Years $years, Days $days, Hours $hours, Minutes $minutes, Seconds $seconds"
            )
        }
    }
}