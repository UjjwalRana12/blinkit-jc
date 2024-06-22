package com.android.blinkitjc.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.android.blinkitjc.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun loginScreen(navController: NavHostController) {

    var phoneNumber by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            illustrationImage(
                modifier = Modifier
                    .height(280.dp)
                    .width(280.dp),
                drawable = R.drawable.chef
            )

            illustrationImage(
                modifier = Modifier
                    .fillMaxWidth(),
                drawable = R.drawable.logo
            )
            OutlinedTextField(
                value = phoneNumber,
                onValueChange = { phoneNumber = it },
                label = { Text(text = "phone number") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                ), singleLine = true
            )
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(25.dp)
            )

            val buttonColor = if (phoneNumber.length == 10) Color(0xFFFFA500) else Color.Gray

            ElevatedButton(
                onClick = { /*TODO*/ }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 52.dp, end = 52.dp),
                colors = ButtonDefaults.buttonColors(buttonColor)
            ) {

                Text(
                    text = "Login", style = TextStyle(
                        color = Color.Black
                    )
                )

            }

        }

    }

}

