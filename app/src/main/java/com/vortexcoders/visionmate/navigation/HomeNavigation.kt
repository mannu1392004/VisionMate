package com.vortexcoders.visionmate.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.vortexcoders.visionmate.model.NavigationBarItemModel
import com.vortexcoders.visionmate.model.Screens
import com.vortexcoders.visionmate.screens.HomeScreen
import com.vortexcoders.visionmate.screens.SOS_Screen
import com.vortexcoders.visionmate.screens.SettingScreen

@Composable
fun HomeNavigation() {
    val navController = rememberNavController()

    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route

    val listOfNavigation = remember {

        listOf(
            NavigationBarItemModel(
                title = "Home",
                selectedItem = Icons.Default.Home,
                route = Screens.HOME_SCREEN.name,
                unselectedItem = Icons.Default.Home
            ),
            NavigationBarItemModel(
                title = "Setting",
                selectedItem = Icons.Default.Settings,
                route = Screens.SETTING_SCREEN.name,
                unselectedItem = Icons.Default.Settings
            ),
            NavigationBarItemModel(
                title = "SOS",
                selectedItem = Icons.Default.Call,
                route = Screens.SOS_SCREEN.name,
                unselectedItem = Icons.Default.Call
            )
        )
    }



    Scaffold(
        bottomBar = {
            NavigationBar {
                listOfNavigation.forEach { item ->
                    val isSelected = item.route == currentRoute
                    NavigationBarItem(
                        onClick = { if (currentRoute != item.route) navController.navigate(item.route) },
                        icon = {
                            Icon(
                                imageVector = item.selectedItem,
                                contentDescription = "",
                                modifier = Modifier.size(25.dp)
                            )
                        },
                        selected = isSelected,
                        label = {
                            Text(
                                item.title,
                                style = MaterialTheme.typography.titleSmall
                            )
                        },
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = if (isSelected) Color.White else Color.Transparent // White when selected
                        )
                    )
                }
            }
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            NavHost(
                navController = navController, startDestination = Screens.HOME_SCREEN.name
            ){
                composable(route = Screens.HOME_SCREEN.name) {
                    HomeScreen()
                }
                composable(route = Screens.SETTING_SCREEN.name) {
                    SettingScreen()
                }
                composable(route = Screens.SOS_SCREEN.name) {
                    SOS_Screen()
                }
            }

        }
    }


}