package com.aniruddha.kudalkar.jetpackapps.emicalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.aniruddha.kudalkar.jetpackapps.R
import com.aniruddha.kudalkar.jetpackapps.databinding.ActivityEmiCalcBinding

class EmiCalcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityEmiCalcBinding>(
            this, R.layout.activity_emi_calc
        )

        val viewModel : EmiViewModel by viewModels()

        binding.lifecycleOwner = this
        binding.vm = viewModel
    }
}