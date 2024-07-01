package com.android.blinkitjc.utils

import android.app.AlertDialog
import android.content.Context
import android.widget.Toast

object Utils {

    private val dialogue:AlertDialog?=null

    fun showToast(message: String,context: Context){
        Toast.makeText(context,message, Toast.LENGTH_SHORT).show()
    }



}