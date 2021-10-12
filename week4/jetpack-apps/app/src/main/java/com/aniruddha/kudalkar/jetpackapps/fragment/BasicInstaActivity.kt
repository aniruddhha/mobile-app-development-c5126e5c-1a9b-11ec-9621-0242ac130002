package com.aniruddha.kudalkar.jetpackapps.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.aniruddha.kudalkar.jetpackapps.R

class BasicInstaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_insta)

        findViewById<ImageView>(R.id.imgMsg).setOnClickListener {
            supportFragmentManager.commit {
                replace<MessagesFragment>(R.id.fragInsta )
            }
        }

        findViewById<ImageView>(R.id.imgPrf).setOnClickListener {
            supportFragmentManager.commit {
                replace<ProfileFragment>(R.id.fragInsta)
            }
        }

        findViewById<ImageView>(R.id.imgSet).setOnClickListener {
            supportFragmentManager.commit {
                replace<SettingsFragment>(R.id.fragInsta)
            }
        }
    }
}