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
        startDestination = "data-list"
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

        composable(
            route = "bulb/{from}/{blb}",
            arguments = listOf(
                navArgument("from") { type = NavType.StringType },
                navArgument("blb")  { type = NavType.BoolType }
            )
        ) {
            val from = it.arguments?.getString("from") ?: "na"
            val blb = it.arguments?.getBoolean("blb") ?: false
            Bulb(from = from , blb = blb )
        }

        composable("data-list" ) {
            DataList(
                dataItems = listOf(
                    DataItem("Abc", "11:00", false),
                    DataItem("Pqr", "11:30", false),
                    DataItem("Lmn", "12:00", false)
                ),
                navCon = navController
            )
        }
    }
}
