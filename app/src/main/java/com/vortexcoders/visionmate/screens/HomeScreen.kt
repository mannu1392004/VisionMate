package com.vortexcoders.visionmate.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.vortexcoders.visionmate.R
import com.vortexcoders.visionmate.model.Screens

@Composable
fun HomeScreen(
    navController: NavController
){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

        Column (modifier = Modifier.padding(horizontal = 10.dp)){
            CustomSections(
                onClick = {
                    navController.navigate(Screens.OUTSIDE_NAVIGATION_SCREEN.name)
                },
                title = "START NAVIGATION",
                image = R.drawable.whatsapp_image_2025_04_17_at_15_15_59
            )
            CustomSections(
                onClick = {
                    navController.navigate(Screens.OBJECT_DETECTION_SCREEN.name)

                },
                title = "OBJECT DETECTION",
                image = R.drawable.whatsapp_image_2025_04_17_at_15_15_58
            )
            CustomSections(
                onClick = {
                    navController.navigate(Screens.INSIDE_NAVIGATION_SCREEN.name)

                },
                title = "INDOOR NAVIGATION",
                image = R.drawable.whatsapp_image_2025_04_17_at_15_15_57
            )
        }
    }
}


@Composable
fun CustomSections(
    onClick:()->Unit,
    title:String,
    image:Int){


Surface (modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
    shadowElevation = 10.dp,
    onClick = {
        onClick()
    }) {

    Column (modifier = Modifier.fillMaxWidth().padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Image(
            painter = painterResource(image), contentDescription = "",
            modifier = Modifier.size(70.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(title)
    }

}

}