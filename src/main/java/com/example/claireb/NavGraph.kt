package com.example.claireb

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.claireb.ui.theme.Display


@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.route){
        composable(
            route = Screen.Home.route
        ){
            Components2(navController)
        }
        composable(
            route = Screen.Bonus.route
        ){
            Display()
        }
    }
}

