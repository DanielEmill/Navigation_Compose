package com.example.navigation_compose.navigation

sealed class AppScreens(val route: String){
    object FirstScreen: AppScreens("First_Screen")
    object SecondScreen: AppScreens("Second_Screen")

}
