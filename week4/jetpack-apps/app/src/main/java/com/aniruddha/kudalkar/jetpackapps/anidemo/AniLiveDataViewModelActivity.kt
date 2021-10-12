package com.aniruddha.kudalkar.jetpackapps.anidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.aniruddha.kudalkar.jetpackapps.R
import com.aniruddha.kudalkar.jetpackapps.databinding.ActivityAniLiveDataViewModelBinding

class AniLiveDataViewModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityAniLiveDataViewModelBinding = DataBindingUtil.setContentView(this, R.layout.activity_ani_live_data_view_model)
        val viewModel by viewModels<MyViewModel>()
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.getUsers().observe(this) {
            Log.i("@ani", "Data Added")
        }

        viewModel.getStr().observe(this) {
            Log.i("@ani", "String Cganged")
        }
    }
}