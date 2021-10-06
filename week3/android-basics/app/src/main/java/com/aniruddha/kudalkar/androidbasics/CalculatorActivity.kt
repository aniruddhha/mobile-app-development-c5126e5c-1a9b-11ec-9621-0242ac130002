package com.aniruddha.kudalkar.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        findViewById<CheckBox>(R.id.chkSh).setOnCheckedChangeListener { _, isChecked ->
            val texRes = findViewById<TextView>(R.id.txRes)
            if(isChecked) {
                texRes.visibility = View.VISIBLE
            }else {
                texRes.visibility = View.INVISIBLE
//                texRes.visibility = View.GONE
            }
        }

        findViewById<Button>(R.id.btAdd).setOnClickListener {
            val txRes = findViewById<TextView>(R.id.txRes)
            val etNum1 = findViewById<EditText>(R.id.etNum1)
            val etNum2 = findViewById<EditText>(R.id.etNum2)

            val num1 = etNum1.text.toString().toInt()
            val num2 = etNum2.text.toString().toInt()
            txRes.text = "${num1 + num2}"
        }

        findViewById<Button>(R.id.btSub).setOnClickListener {
            val txRes = findViewById<TextView>(R.id.txRes)
            val etNum1 = findViewById<EditText>(R.id.etNum1)
            val etNum2 = findViewById<EditText>(R.id.etNum2)

            val num1 = etNum1.text.toString().toDouble()
            val num2 = etNum2.text.toString().toDouble()
            txRes.text = "${num1 - num2}"
        }

        findViewById<Button>(R.id.btMul).setOnClickListener { letsClick(R.id.btMul) }

        findViewById<Button>(R.id.btDiv).setOnClickListener { letsClick(R.id.btDiv) }
    }

    private fun letsClick(id : Int) {

        Log.i("anidroid", "This is information")
        Log.d("anidroid", "This is debug")
        Log.w("anidroid", "This is warning")
        Log.v("anidroid", "This is verbose")
        Log.e("anidroid", "This is error")

        val txRes = findViewById<TextView>(R.id.txRes)
        val etNum1 = findViewById<EditText>(R.id.etNum1)
        val etNum2 = findViewById<EditText>(R.id.etNum2)

        val num1 = etNum1.text?.toString()?.toDouble() ?: 0.0
        val num2 = etNum2.text?.toString()?.toDouble() ?: 0.0

        when(id) {
            R.id.btAdd -> { txRes.text = "${num1 + num2}"   }
            R.id.btSub -> { txRes.text = "${num1 - num2}"  }
            R.id.btMul -> { txRes.text = "${num1 * num2}"   }
            R.id.btDiv -> {  txRes.text = "${num1 / num2}"   }
        }
    }
}