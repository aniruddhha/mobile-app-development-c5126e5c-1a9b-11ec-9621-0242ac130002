package com.aniruddha.kudalkar.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

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

        findViewById<Button>(R.id.btMul).setOnClickListener {
            val txRes = findViewById<TextView>(R.id.txRes)
            val etNum1 = findViewById<EditText>(R.id.etNum1)
            val etNum2 = findViewById<EditText>(R.id.etNum2)

            val num1 = etNum1.text.toString().toDouble()
            val num2 = etNum2.text.toString().toDouble()
            txRes.text = "${num1 * num2}"
        }

        findViewById<Button>(R.id.btDiv).setOnClickListener {
            val txRes = findViewById<TextView>(R.id.txRes)
            val etNum1 = findViewById<EditText>(R.id.etNum1)
            val etNum2 = findViewById<EditText>(R.id.etNum2)

            val num1 = etNum1.text.toString().toDouble()
            val num2 = etNum2.text.toString().toDouble()
            txRes.text = "${num1 / num2}"
        }
    }
}