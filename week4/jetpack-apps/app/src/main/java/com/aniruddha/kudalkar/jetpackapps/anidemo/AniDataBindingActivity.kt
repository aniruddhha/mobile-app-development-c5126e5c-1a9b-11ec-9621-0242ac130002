package com.aniruddha.kudalkar.jetpackapps.anidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.aniruddha.kudalkar.jetpackapps.R
import com.aniruddha.kudalkar.jetpackapps.databinding.ActivityAniDataBindingBinding

data class AppUser(
    val nm : String = "Android",
    val ag : Int = 123,
    val mob: String = "+914562599",
    val hnd : String = "@hello"
)

class AniDataBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val binding = DataBindingUtil.setContentView<ActivityAniDataBindingBinding>(
           this,
           R.layout.activity_ani_data_binding
       )
        binding.user = AppUser("android", 56, "+9189533658", "@android")
        binding.setClickListener {
            binding.user = AppUser(
                "ppppp",
                89,
                "+9999999",
                "@33333"
            )
        }
    }
}