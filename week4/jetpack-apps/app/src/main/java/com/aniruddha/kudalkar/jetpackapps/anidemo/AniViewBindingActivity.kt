package com.aniruddha.kudalkar.jetpackapps.anidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aniruddha.kudalkar.jetpackapps.R
import com.aniruddha.kudalkar.jetpackapps.databinding.ActivityAniDemoBinding
import java.util.*

class AniViewBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAniDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityAniDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txt.setText("hello")
        binding.btn.setOnClickListener { binding.txt.setText(Date().toString()) }
    }
}