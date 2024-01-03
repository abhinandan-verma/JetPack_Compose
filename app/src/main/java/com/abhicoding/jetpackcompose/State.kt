package com.abhicoding.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun NotificationScreen() {
    val count = rememberSaveable {
        mutableIntStateOf(0)
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
          NotificationCounter(count.intValue) { count.intValue++ }
        MessageBar(count.intValue)
    }
}

@Composable
fun NotificationCounter(count: Int, increment: () -> Int) {

    Column(
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "You have sent $count notifications",
            color = Color.Magenta,
            fontSize = 22.sp
        )
        Button(onClick = { increment() }) {
            Text(text = "Send Notifications for $count")
        }
    }
}

@Composable
fun MessageBar(count: Int) {
    Card(
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Row(
            Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(imageVector = Icons.Outlined.Favorite,
                contentDescription = "",
                Modifier.padding(4.dp))
            Text(text = "Message sent so far -> $count")
        }
    }
}
