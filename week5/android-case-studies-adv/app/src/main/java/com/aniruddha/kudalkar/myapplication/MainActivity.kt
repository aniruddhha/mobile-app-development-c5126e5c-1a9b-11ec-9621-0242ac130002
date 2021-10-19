package com.aniruddha.kudalkar.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.aniruddha.kudalkar.myapplication.databinding.ActivityMainBinding
import com.aniruddha.kudalkar.myapplication.recgrd.BasicDetailsViewModel
import com.aniruddha.kudalkar.myapplication.recgrd.SalaryDetailsViewModel
import com.aniruddha.kudalkar.myapplication.recgrd.SharedViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel : SharedViewModel by viewModels()
        val bdVm : BasicDetailsViewModel by viewModels()
        val sdVm : SalaryDetailsViewModel by viewModels()

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.vm = viewModel
        binding.lifecycleOwner = this
    }
}