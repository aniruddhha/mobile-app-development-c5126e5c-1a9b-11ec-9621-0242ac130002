package com.aniruddha.kudalkar.thirdpartylibs

import android.Manifest
import android.os.Bundle
import android.os.Looper
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.aniruddha.kudalkar.thirdpartylibs.databinding.ActivityMainBinding
import com.google.android.gms.location.*
import permissions.dispatcher.*

@RuntimePermissions
class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    private lateinit var locationClient: FusedLocationProviderClient
    private val locationCallback = object : LocationCallback() {
        override fun onLocationResult(loc: LocationResult?) {
            super.onLocationResult(loc)

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        initLocations()
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

    @NeedsPermission(
        Manifest.permission.ACCESS_FINE_LOCATION,
        Manifest.permission.ACCESS_COARSE_LOCATION
    )
    fun initLocations() {

        locationClient = LocationServices.getFusedLocationProviderClient(this)

        val locReq = LocationRequest.create()
        locReq.setInterval(1000)
        locReq.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)

        locationClient.requestLocationUpdates(
            locReq,
            locationCallback,
            Looper.myLooper()
        )
    }

    @OnShowRationale(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION)
    fun showRationaleForCamera(request: PermissionRequest) {
        Toast.makeText(this, "Need Permissions", Toast.LENGTH_SHORT).show()
        Log.i("@ani", "it is working")
    }

    @OnPermissionDenied(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION)
    fun onCameraDenied() {
        Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show()
    }

    @OnNeverAskAgain(Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION)
    fun onCameraNeverAskAgain() {
        Toast.makeText(this,"Never Ask Again", Toast.LENGTH_SHORT).show()
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        // NOTE: delegate the permission handling to generated function
        onRequestPermissionsResult(requestCode, grantResults)
    }
}