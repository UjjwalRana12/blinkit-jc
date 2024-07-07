package com.android.blinkitjc.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.blinkitjc.R
import me.onebone.toolbar.CollapsingToolbarScaffold
import me.onebone.toolbar.ScrollStrategy
import me.onebone.toolbar.rememberCollapsingToolbarScaffoldState

@Composable
fun userActivity(navController: NavHostController) {
    MainContent()
}

@Composable
fun MainContent() {
    val state = rememberCollapsingToolbarScaffoldState()

    CollapsingToolbarScaffold(modifier = Modifier,
        state = state,
        scrollStrategy = ScrollStrategy.EnterAlways,
        toolbar = {
            val textSize = (18 + (30 - 12) * state.toolbarState.progress).sp

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .pin()
                    .background(color = Color.Yellow)
            )
            Column {


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                        .road(
                            whenCollapsed = Alignment.TopStart, whenExpanded = Alignment.BottomStart
                        ),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "Collapsing Toolbar",
                        fontSize = 24.sp,
                        style = TextStyle(color = Color.Black, fontSize = textSize)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_person_24),
                        contentDescription = "Menu Icon",
                        tint = Color.Black
                    )
                }

                Card( modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(bottomStart = 26.dp, bottomEnd = 26.dp))) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .pin()
                            .background(color = Color.Yellow)
                    ){
                      SearchBar(onSearch = {})
                    }
                }

            }
        }) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(100) { index ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Text(
                        text = "This is card number $index",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    )
                }
            }
        }
    }
}
