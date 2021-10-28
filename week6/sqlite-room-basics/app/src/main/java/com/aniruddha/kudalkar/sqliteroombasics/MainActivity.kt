package com.aniruddha.kudalkar.sqliteroombasics

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.room.Room
import androidx.room.RoomDatabase
import com.aniruddha.kudalkar.sqliteroombasics.R
import com.aniruddha.kudalkar.sqliteroombasics.databinding.ActivityMainBinding
import com.aniruddha.kudalkar.sqliteroombasics.db.Dealer
import com.aniruddha.kudalkar.sqliteroombasics.db.DealerDao
import com.aniruddha.kudalkar.sqliteroombasics.db.DealerDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    private lateinit var db : DealerDatabase
    private lateinit var dealerDao: DealerDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)


        db = Room.databaseBuilder(
            this,
            DealerDatabase::class.java,
            "dealer-database"
        ).build()

        dealerDao = db.dealerDao()

        val scp =   CoroutineScope(Job() + Dispatchers.IO)

        binding.fab.setOnClickListener { view ->

            val dlr = Dealer(
                dlNm = "pqr",
                isActive = false,
                mobile = "274724425",
                period = 10
            )
            scp.launch {
                dealerDao.createNewDealer(dlr)
            }

            scp.launch {
                dealerDao.findAllDealers().forEach { dl ->
                    Log.i("@ani", "${dl.id} ${dl.dlNm}, ${dl.mobile}, ${dl.isActive}, ${dl.period} ")
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}