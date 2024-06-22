package com.android.blinkitjc.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import com.android.blinkitjc.Navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun splashScreen(navController: NavHostController) {
        Text(text = "thi is splash screen")
                
        LaunchedEffect(true){
                delay(500)

                navController.navigate(Routes.Login.routes){
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                }
        }
        
}