package com.android.blinkitjc.Navigation

import android.annotation.SuppressLint
import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.android.blinkitjc.screens.PhoneAuthScreen
import com.android.blinkitjc.screens.splashScreen
import com.android.blinkitjc.screens.userActivity
import com.android.blinkitjc.viewmodel.AuthViewModel

@SuppressLint("SuspiciousIndentation")
@Composable
fun navGraph(navController: NavHostController,activity: ComponentActivity){
    val viewModel: AuthViewModel = viewModel()

        NavHost(navController = navController, startDestination = Routes.Splash.routes ){

            composable(Routes.Splash.routes){
                splashScreen(navController,viewModel)
            }


            composable(Routes.Otp.routes){
            PhoneAuthScreen(viewModel =viewModel , activity,navController)
            }

            composable(Routes.UserActivity.routes){
                userActivity(navController)
            }
        }
    }
