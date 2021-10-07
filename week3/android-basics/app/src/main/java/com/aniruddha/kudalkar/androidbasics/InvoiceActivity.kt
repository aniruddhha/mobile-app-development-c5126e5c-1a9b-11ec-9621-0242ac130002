package com.aniruddha.kudalkar.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.time.LocalDate
import java.util.*
import kotlin.random.Random

class InvoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invoice)

        populateInvoiceDetails()
    }

    private fun populateInvoiceDetails() {

        findViewById<TextView>(R.id.txtInvNum).text = "#${Random(233).nextInt()}"
        findViewById<TextView>(R.id.txtClNm).text = "Abc Pvt Ltd"
        findViewById<TextView>(R.id.txtClAddr).text = "#122, abc street, pqr road."

        findViewById<TextView>(R.id.txtInvDt).text = "13-01-2021"
        findViewById<TextView>(R.id.txtInvAmt).text = "INR. 20317"
    }
}