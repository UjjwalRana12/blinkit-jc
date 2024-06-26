package com.android.blinkitjc.utils

import android.content.Context
import android.widget.Toast

object utils {

    fun showToast(message: String,context: Context){
        Toast.makeText(context,message, Toast.LENGTH_SHORT).show()
    }
}