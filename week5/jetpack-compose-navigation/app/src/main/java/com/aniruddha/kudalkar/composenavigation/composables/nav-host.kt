package com.aniruddha.kudalkar.composenavigation.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument

@Composable
fun AppNavHost(
    navController :NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = "sdjjdgsxg"
    ) {
        composable(
            route = "grt/{msg}",
            arguments = listOf(
                navArgument("msg") { type = NavType.StringType }
            )
        ) {
            val msg = it.arguments?.getString("msg") ?: ""
            Greeting(name = msg)
        }
        composable("sdjjdgsxg") {
            Profile(navCon = navController)
        }
    }
}
