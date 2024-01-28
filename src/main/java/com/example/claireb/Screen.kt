package com.example.claireb

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Bonus: Screen(route = "bonus_screen")
}


