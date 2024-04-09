package com.stu74527.assigment2_74527


import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.MainScreen.route,
    ) {
        composable(route = Routes.FirstScreen.route)
        {
            First(navController = navController)
        }
        composable(route = Routes.SecondScreen.route)
        {
            First(navController = navController)
        }
        composable(route = Routes.ThirdScreen.route)
        {
            First(navController = navController)
        }
        composable(route = Routes.MainScreen.route)
        {
            First(navController = navController)
        }
        composable(route = Routes.InformationScreen.route + "/movie1")
        {
            Info(navController = navController, film = AllMovie[0])
        }
        composable(route = Routes.InformationScreen.route + "/movie2")
        {
            Info(navController = navController, film = AllMovie[1])
        }
        composable(route = Routes.InformationScreen.route + "/movie3")
        {
            Info(navController = navController, film = AllMovie[2])
        }
        composable(route = Routes.InformationScreen.route + "/movie4")
        {
            Info(navController = navController, film = AllMovie[3])
        }
    }
}