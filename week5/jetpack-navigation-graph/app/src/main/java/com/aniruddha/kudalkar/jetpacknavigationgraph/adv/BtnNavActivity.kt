package com.aniruddha.kudalkar.jetpacknavigationgraph.adv

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.aniruddha.kudalkar.jetpacknavigationgraph.R
import com.aniruddha.kudalkar.jetpacknavigationgraph.databinding.ActivityBtnNavBinding

class BtnNavActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBtnNavBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBtnNavBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val fragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_btn_nav) as NavHostFragment
        val navController = fragment.navController
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_dashboard,
                R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}