package com.android.blinkitjc.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay
import com.android.blinkitjc.R
import com.android.blinkitjc.Navigation.Routes


@Composable
fun splashScreen(navController: NavHostController) {
        Text(text = "thi is splash screen")
                
        LaunchedEffect(true){
                delay(500)

                navController.navigate(Routes.Otp.routes){
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                }
        }
        Box(
                modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color(0xFFFFEB00)),
                contentAlignment = Alignment.Center
        ) {
                Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                ) {
                        Image(
                                painter = painterResource(id = R.drawable.blinkit_logo),
                                contentDescription = null,
                                modifier = Modifier.size(250.dp)
                        )

                }
        }
}
