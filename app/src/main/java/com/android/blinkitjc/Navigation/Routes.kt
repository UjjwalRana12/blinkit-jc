package com.android.blinkitjc.Navigation

sealed class Routes(val routes: String){

    object Splash:Routes("splash")
    object Login:Routes("login")
    object Home:Routes("home")



}
