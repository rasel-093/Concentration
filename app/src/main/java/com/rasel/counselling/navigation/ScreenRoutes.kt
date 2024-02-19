package com.rasel.counselling.navigation

sealed class Screen(val route: String) {
    data object HomeScreen : Screen("home")
    data object BreathingScreen : Screen("breathing")
    data object ListeningScreen : Screen("listening")
    data object SettingScreen : Screen("setting")
    data object QuotesScreen : Screen("quote")
}