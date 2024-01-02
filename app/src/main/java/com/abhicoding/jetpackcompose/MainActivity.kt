package com.abhicoding.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Text(text = "Hello Abhinandan")
        }
    }
}
@Preview(showBackground = true, widthDp = 500, heightDp = 300)
@Composable
private fun PreviewFunction(){
    Button(onClick = { }, colors = ButtonDefaults.buttonColors(
        contentColor = Color.Magenta,
        containerColor = Color.Green
    ), enabled = true) {
        Text(text = "Hello Abhinandan")
        Image(painter = painterResource(id = R.drawable.photo),
            contentDescription = "My Photo",
            )
    }
}
