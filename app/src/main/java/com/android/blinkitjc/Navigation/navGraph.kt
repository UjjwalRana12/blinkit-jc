package com.android.blinkitjc.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.android.blinkitjc.screens.loginScreen
import com.android.blinkitjc.screens.splashScreen

@Composable
fun navGraph(navController: NavHostController){

        NavHost(navController = navController, startDestination = Routes.Splash.routes ){

            composable(Routes.Splash.routes){
                splashScreen(navController)
            }

            composable(Routes.Login.routes){
                loginScreen(navController)
            }
        }
    }
