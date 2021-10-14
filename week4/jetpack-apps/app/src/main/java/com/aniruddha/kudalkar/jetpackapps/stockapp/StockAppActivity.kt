package com.aniruddha.kudalkar.jetpackapps.stockapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.aniruddha.kudalkar.jetpackapps.R

class StockAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stock_app)

        loadLogin()

        val vm : StockViewModel by viewModels()

        vm.loginCheck.observe(this) {
            Log.i("@ani", "State is $it")
            if(it == 100) loadStocks()
            else Toast.makeText(this, "Invalid Login", Toast.LENGTH_SHORT).show()
        }
    }

    private fun loadLogin() {
        supportFragmentManager.commit {
            replace<LoginFragment>(R.id.fragMainContainer)
        }
    }

    private fun loadStocks() {
        supportFragmentManager.commit {
            replace<StocksFragment>(R.id.fragMainContainer)
        }
    }
}