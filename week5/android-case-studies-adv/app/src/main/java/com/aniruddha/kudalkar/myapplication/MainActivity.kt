package com.aniruddha.kudalkar.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.aniruddha.kudalkar.myapplication.databinding.ActivityMainBinding

import com.aniruddha.kudalkar.myapplication.recgrd.SharedViewModel

class MainActivity : AppCompatActivity() {

    val viewModel : SharedViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.vm = viewModel
//        binding.bdVm = bdVm
//        binding.sdVm = sdVm
        binding.lifecycleOwner = this

        viewModel.appData.observe(this) {
            Log.i("@ani", "In An Activity")
            Log.i("@ani", it.toString())
        }
    }
}