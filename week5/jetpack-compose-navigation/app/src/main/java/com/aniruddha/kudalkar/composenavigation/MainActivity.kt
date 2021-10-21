package com.aniruddha.kudalkar.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aniruddha.kudalkar.composenavigation.ui.theme.ComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = "sdjjdgsxg" ) {
                composable("grt") { Greeting(name = "skjdjfhsjfdhhfsdjh") }
                composable("sdjjdgsxg") { Profile(navCon = navController) }
            }
        }
    }
}

@Composable
fun Profile(navCon : NavController) {
    Column {
        Button(onClick = { navCon.navigate("grt")  }) {
            Text(text = "Greetings")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "sdfsadfsafasfd $name!")
}

