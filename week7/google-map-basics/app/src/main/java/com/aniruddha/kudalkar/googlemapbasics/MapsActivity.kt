package com.aniruddha.kudalkar.googlemapbasics

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.util.Log

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.aniruddha.kudalkar.googlemapbasics.databinding.ActivityMapsBinding
import com.google.android.gms.location.*
import com.google.android.gms.maps.model.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding
    private lateinit var myLoc: Marker
    private lateinit var locCl: FusedLocationProviderClient
    private lateinit var cityMarker : Marker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)

        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        val mapsApp = application as MapsApp
        binding.button.setOnClickListener {

            val city = binding.editTextTextPersonName.text.toString()
            Log.i("@ani", "Button Clicked $city")

            mapsApp.weatherApi
                .weatherOfCity(city)
                .enqueue( object : Callback<MainResponse> {
                    override fun onResponse(
                        call: Call<MainResponse>,
                        response: Response<MainResponse>
                    ) {
                        Log.i("@ani", " --> Got the response from server ${response.code()}")
                        val mainResponse = response.body()
                        Log.i("@ani", "${mainResponse.toString()}")
                        mainResponse?.let {
                            cityMarker.position = LatLng(it.coordinates.lat, it.coordinates.lon)
                            cityMarker.title = "${it.weather[0].description}"

                            mMap.moveCamera(
                                CameraUpdateFactory.newLatLngZoom(cityMarker.position, 8.0f)
                            )
                        }
                    }

                    override fun onFailure(call: Call<MainResponse>, t: Throwable) {
                        Log.i("@ani", "Problem in fetching city details")
                    }
                } )
        }

        initLocationProvider()
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.mapType = GoogleMap.MAP_TYPE_HYBRID
        // Add a marker in Sydney and move the camera
        val sydney = LatLng(-34.0, 151.0)
        mMap.addMarker(
            MarkerOptions()
                .position(sydney)
                .title("Marker in Sydney")
        )

        val pnLl = LatLng(18.52, 73.85)
        val jpLl = LatLng(36.20, 138.25)

        mMap.addMarker(
            MarkerOptions()
                .position(pnLl)
                .title("Pune")
        )

        mMap.addMarker(
            MarkerOptions()
                .position(jpLl)
                .title("Japan")
        )

        mMap.addPolyline(
            PolylineOptions()
                .color(Color.RED)
                .width(5.0f)
                .add(pnLl, jpLl)
        )

        mMap.addCircle(
            CircleOptions()
                .center(pnLl)
                .radius(80.56)
                .fillColor(Color.RED)
                .strokeWidth(5.0f)
        )

        myLoc = mMap.addMarker(
            MarkerOptions()
                .position(LatLng(0.0, 0.0))
                .title("Bengaluru")
        )

        cityMarker = mMap.addMarker(
            MarkerOptions()
                .position(LatLng(0.0, 0.0))
        )

        mMap.moveCamera(CameraUpdateFactory.zoomTo(12.0f))
    }

    @SuppressLint("MissingPermission")
    private fun initLocationProvider() {

        val locReq = LocationRequest()
        locReq.setInterval(1000)
        locReq.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)

        locCl = LocationServices.getFusedLocationProviderClient(this)
        locCl.requestLocationUpdates(
            locReq, object : LocationCallback() {
                override fun onLocationResult(result: LocationResult?) {
                    super.onLocationResult(result)

                    result?.let {
                        Log.i("@ani", "last Lat ${it.lastLocation.latitude}")
                        Log.i("@ani", "last Lng ${it.lastLocation.longitude}")
                        val ltstLoc = it.locations.last()
                        Log.i("@ani", "Latest Lat ${ltstLoc.latitude}")
                        Log.i("@ani", "Latest Lmg ${ltstLoc.longitude}")

                        myLoc.position = LatLng(ltstLoc.latitude, ltstLoc.longitude)

                    }
                }
            }, Looper.myLooper()
        )
    }
}