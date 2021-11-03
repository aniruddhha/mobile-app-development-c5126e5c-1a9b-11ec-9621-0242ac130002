package com.aniruddha.kudalkar.retrofitcasestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.runtime.*
import com.aniruddha.kudalkar.retrofitcasestudy.domain.MainResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var wthInfo : String by remember {
                mutableStateOf("")
            }

            var city : String by remember {
                mutableStateOf("")
            }

            Column {
                Row{
                    TextField(
                        value = city,
                        onValueChange =  { city = it }
                    )
                }
                Row {
                    Button(onClick = {

                        (application as CaseStudyApp).weatherApi
                            .weatherOfCity(city).enqueue( object : Callback<MainResponse> {
                                override fun onResponse(
                                    call: Call<MainResponse>,
                                    response: Response<MainResponse>
                                ) {

                                    val mainResponse = response.body()
                                    mainResponse?.let {
                                        wthInfo = it.weather[0].description
                                    }
                                }

                                override fun onFailure(call: Call<MainResponse>, t: Throwable) {

                                }
                            } )
                    }) {
                        Text(text = "Weather")
                    }
                }
                Row {
                    Text(text = wthInfo)
                }
            }
        }
    }
}

