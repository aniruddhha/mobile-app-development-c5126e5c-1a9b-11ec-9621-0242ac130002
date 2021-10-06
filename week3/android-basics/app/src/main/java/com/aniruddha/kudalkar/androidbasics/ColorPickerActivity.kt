package com.aniruddha.kudalkar.androidbasics

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ColorPickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_picker)

        val kafhskafhdslkhfd = findViewById<Button>(R.id.btPk)
        kafhskafhdslkhfd.setOnClickListener {

            val etRd = findViewById<EditText>(R.id.etRd)
            val red = etRd.text.toString().toInt()

            val etGrn = findViewById<EditText>(R.id.etGrn)
            val green = etGrn.text.toString().toInt()

            val etBlu = findViewById<EditText>(R.id.etBlu)
            val blue = etBlu.text.toString().toInt()

            val txtClr = findViewById<TextView>(R.id.txtClr)

            if( (red in 0..255) && (green in 0..255) && (blue in 0..255) ) {
                txtClr.setTextColor(Color.rgb(red, green, blue))
            }else {
                txtClr.setTextColor(Color.BLACK)
                txtClr.text = "Bad Color - $red, $green, $blue"
            }
        }
    }
}