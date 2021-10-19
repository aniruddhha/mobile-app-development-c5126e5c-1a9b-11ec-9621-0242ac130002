package com.aniruddha.kudalkar.myapplication.recgrd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.aniruddha.kudalkar.myapplication.R
import com.aniruddha.kudalkar.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val viewModel : SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )
        binding.vm = viewModel
        binding.lifecycleOwner = this

        viewModel.appData.observe(this) {
            supportFragmentManager.commit {
                replace<RecGrdFragment>(R.id.fragmentContainerView)
            }
        }

        traditionalWayOfPassingData()
    }

    private fun traditionalWayOfPassingData() {

        supportFragmentManager.commit {
            replace(
                R.id.fragmentContainerView,
                TraditionalFragment.newInstance("green", "#00ff00")
            )
        }
    }
}