package com.android.blinkitjc.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun illustrationImage(modifier: Modifier, @DrawableRes drawable: Int) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize()
    ) {
        Image(
            painter = painterResource(id = drawable),
            contentDescription = "illustration chef image",
            modifier = modifier
        )

    }
}

@Composable
fun SearchBar(

    onSearch: (String) -> Unit
) {
    Box(
        modifier = Modifier.padding(8.dp)
        .background(Color.Yellow)
        .border(1.dp, Color.Gray, MaterialTheme.shapes.medium)
        .padding(5.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {

            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null, // decorative element
                tint = Color.White,
                modifier = Modifier.size(18.dp)
            )

            // Search Input Field
            val (text, setText) = remember { mutableStateOf("") }
            BasicTextField(
                value = text,
                onValueChange = { newText ->
                    setText(newText)
                    onSearch(newText)
                },

                modifier = Modifier
                    .weight(1f)
                    .padding(start = 8.dp, end = 8.dp)

            )
            if (text.isNotEmpty()) {
                IconButton(
                    onClick = { setText("") },
                    modifier = Modifier.size(24.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Clear,
                        contentDescription = "Clear",
                        tint = Color.Black,
                    )
                }
            }
        }
    }
}