package com.example.simplenav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "firstscreen") {
        composable(route = "firstscreen") {
            FirstScreen {
                navController.navigate("secondscreen")
            }
        }
        composable(route = "secondscreen") {
            SecondScreen {
                navController.navigate(route= "firstscreen")
            }
        }
    }

    navController.navigate(route = "firstscreen")


}
