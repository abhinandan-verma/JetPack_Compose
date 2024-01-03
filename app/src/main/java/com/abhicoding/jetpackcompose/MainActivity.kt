package com.abhicoding.jetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abhicoding.jetpackcompose.ui.theme.PreviewItem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        PreviewItem()
        }
    }
}
@Preview(showBackground = true, widthDp = 200, heightDp = 200)
@Composable
private fun PreviewFunction() {
    Text(text = "AbhCoding",
        color = Color.White,
        modifier = Modifier
            .clickable { }
            .background(Color.Blue)
            .size(200.dp)
            .padding(16.dp)
            .border(4.dp, Color.Magenta)
            .clip(CircleShape)
            .background(Color.Green)

    )
}
@Composable
fun ListViewItem(imgId: Int, name: String,occupation:String,modifier: Modifier){
    Row (
        modifier.padding(8.dp)
    ){
        Image(painter = painterResource(id = imgId),
            contentDescription = "",
            modifier = Modifier.size(100.dp))
        Column {
            Text(text = name,
                fontWeight = FontWeight.Bold)
            Text(text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp)
        }
    }
}
@Composable
fun CircularImage(){
    Image(painter = painterResource(id = R.drawable.profil),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(150.dp)
            .clip(CircleShape)
            .border(4.dp, Color.Magenta, CircleShape)
            .shadow(5.dp)
        ,contentDescription = "")
}
@Composable
fun TextInput(){
    val state = remember {
        mutableStateOf("AbhCoding")
    }
    TextField(value = state.value,
        onValueChange = {
            state.value = it
            Log.i("TAG",it)
        },
        label = { Text(text = "Enter Name")})
}
