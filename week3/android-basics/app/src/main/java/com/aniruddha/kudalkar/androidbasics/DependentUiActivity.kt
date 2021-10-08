package com.aniruddha.kudalkar.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.util.TypedValue
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import androidx.core.widget.doOnTextChanged

class DependentUiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dependent_ui)

        watchingTextTraditionalWay()
    }

    private fun seekBarChangeEvents() {
        val txt = findViewById<TextView>(R.id.txt)

        val skBr = findViewById<SeekBar>(R.id.skBr)
        skBr.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Log.i("@ani", "$progress")
                txt.setTextSize(progress.toFloat())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })
    }

    private fun watchingTextKotlinsWay() {
        val txt = findViewById<TextView>(R.id.txt)
        val et = findViewById<EditText>(R.id.etSz)
        et.doOnTextChanged { text, _, _, _ ->
            Log.i("@ani", "Text is $text")
            if(text.toString().isEmpty().not())
                txt.textSize = text.toString().toFloat()
            else txt.setTextSize(1f)
        }
    }

    private fun watchingTextTraditionalWay() {
        val txt = findViewById<TextView>(R.id.txt)
        val et = findViewById<EditText>(R.id.etSz)

        et.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(text: CharSequence?, start: Int, before: Int, count: Int) {
                if(text.toString().isEmpty().not())
                    txt.textSize = text.toString().toFloat()
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })
    }
}