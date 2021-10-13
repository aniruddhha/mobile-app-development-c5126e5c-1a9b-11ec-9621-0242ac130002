package com.aniruddha.kudalkar.jetpackapps.archcomp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.aniruddha.kudalkar.jetpackapps.R
import com.aniruddha.kudalkar.jetpackapps.databinding.ActivityDbDemoBinding

data class Invoice(
    val num: String = "#89565",
    val client: String = "Abc Copr Ltd",
    val amt : Double = 56.23,
    val date: String = "01-09-2021"
)

// ActivityDbDemoBinding
class DbDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityDbDemoBinding = DataBindingUtil
            .setContentView(this, R.layout.activity_db_demo)

        binding.inv = Invoice()
    }
}