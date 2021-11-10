package com.aniruddha.kudalkar.thirdpartylibs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import eu.long1.spacetablayout.SpaceTabLayout

class SpaceTabActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_space_tab)

        val pager = findViewById<ViewPager>(R.id.viewPager)

        val tabLayout = findViewById<SpaceTabLayout>(R.id.spaceTabLayout)

        tabLayout.initialize(
            pager,
            supportFragmentManager,
            mutableListOf<Fragment>(
                FirstFragment(),
                SecondFragment(),
                SecondFragment()
            ),
            null
        )

    }
}