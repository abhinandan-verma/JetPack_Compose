package com.abhicoding.jetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          TextInput()
        }
    }
}
@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction() {
    Column(
        Modifier.padding(5.dp)
    ) {
        ListViewItem(R.drawable.photo,"Abhinandan","Software Engineer")
        ListViewItem(R.drawable.profil,"Abhinandan","Software Engineer")
        ListViewItem(R.drawable.trigo,"Abhinandan","Software Engineer")
        ListViewItem(R.drawable.ic_launcher_foreground,"Abhinandan","Software Engineer")
    }


  /*  Box(contentAlignment = Alignment.BottomEnd) {
        Image(painter = painterResource(id = R.drawable.photo), contentDescription = "Photo")
        Image(painter = painterResource(id = R.drawable.profil), contentDescription = "Profile")
    }
   */
    /* Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }
    */
/*
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }
 */
}
@Composable
fun ListViewItem(imgId: Int, name: String,occupation:String){
    Row {
        Image(painter = painterResource(id = imgId),
            contentDescription = "",
            Modifier.size(100.dp))
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
