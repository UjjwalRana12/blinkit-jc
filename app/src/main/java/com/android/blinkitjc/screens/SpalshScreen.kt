package com.android.blinkitjc.screens

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay
import com.android.blinkitjc.R
import com.android.blinkitjc.Navigation.Routes
import com.android.blinkitjc.viewmodel.AuthViewModel


@Composable
fun splashScreen(navController: NavHostController,viewModel: AuthViewModel) {

        val isCurrentUser by viewModel.isCurrentUser.collectAsState()

        LaunchedEffect(isCurrentUser) {
                Handler(Looper.getMainLooper()).postDelayed({
                        if (isCurrentUser) {
                                navController.navigate(Routes.UserActivity.routes) {
                                        popUpTo(Routes.Splash.routes) { inclusive = true }
                                }
                        } else {
                                navController.navigate(Routes.Otp.routes) {
                                        popUpTo(Routes.Splash.routes) { inclusive = true }
                                }
                        }
                }, 2000)
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
