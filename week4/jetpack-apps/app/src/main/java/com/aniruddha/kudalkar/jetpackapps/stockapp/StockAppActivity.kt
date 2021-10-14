package com.aniruddha.kudalkar.jetpackapps.stockapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.aniruddha.kudalkar.jetpackapps.R

class StockAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stock_app)
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