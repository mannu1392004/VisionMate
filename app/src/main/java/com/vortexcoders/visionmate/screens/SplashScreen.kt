package com.vortexcoders.visionmate.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.vortexcoders.visionmate.R
import com.vortexcoders.visionmate.model.Screens
import kotlinx.coroutines.time.delay
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds
@Composable
fun SplashScreen(
    navController: NavHostController
){
    Box(
        modifier = Modifier.fillMaxSize().background(
            color = Color(0xE8171515)
        ),
        contentAlignment = Alignment.Center,

    ){
        LaunchedEffect(Unit) {
            delay(2.seconds)
            navController.navigate(Screens.HOME_NAVIGATION.name)
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.vision_mate),
                contentDescription = ""
            )


            Spacer(modifier = Modifier.height(150.dp))


            CircularProgressIndicator(
                color = Color.White
            )



        }




    }
}