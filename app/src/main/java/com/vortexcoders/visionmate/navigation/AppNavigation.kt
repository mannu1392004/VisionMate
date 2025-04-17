package com.vortexcoders.visionmate.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vortexcoders.visionmate.model.Screens
import com.vortexcoders.visionmate.screens.HomeScreen
import com.vortexcoders.visionmate.screens.InSideNavigationScreen
import com.vortexcoders.visionmate.screens.ObjectDetectionScreen
import com.vortexcoders.visionmate.screens.OutSideNavigationScreen
import com.vortexcoders.visionmate.screens.SplashScreen

@Composable
fun  MainNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.SPLASH_SCREEN.name){

        composable(route = Screens.SPLASH_SCREEN.name) {
            SplashScreen(navController)
        }

        composable(route = Screens.HOME_NAVIGATION.name) {
            HomeNavigation()
        }

        composable(route = Screens.OUTSIDE_NAVIGATION_SCREEN.name) {
            OutSideNavigationScreen()

        }

        composable(route = Screens.OBJECT_DETECTION_SCREEN.name) {
            ObjectDetectionScreen()
        }
        composable(route = Screens.INSIDE_NAVIGATION_SCREEN.name) {
            InSideNavigationScreen()
        }

    }






}