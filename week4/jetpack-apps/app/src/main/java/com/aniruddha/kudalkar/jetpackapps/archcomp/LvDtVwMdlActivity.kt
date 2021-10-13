package com.aniruddha.kudalkar.jetpackapps.archcomp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.aniruddha.kudalkar.jetpackapps.R
import com.aniruddha.kudalkar.jetpackapps.databinding.ActivityLvDtVwMdlBinding

class LvDtVwMdlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityLvDtVwMdlBinding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_lv_dt_vw_mdl
        )

        val viewModel: LvDtVmViewModel by viewModels()
        binding.vm = viewModel
        binding.lifecycleOwner = this

        viewModel.prg.observe(this) {
            Log.i("@ani", "Progress is $it")
        }
    }
}

abstract class Animal

class Tiger : Animal() {
    fun hiTiger() { }
}

fun diff() {
    val an: Animal = Tiger()
//    an.hiTiger()
}