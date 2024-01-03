package com.abhicoding.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(heightDp = 500)
@Composable
fun PreviewItem() {
    LazyColumn(content = {
        items(getCategoryList()){ item ->
            BlogCategory(imgId = item.imgId, title = item.title, subtitle = item.subtitle)

        }
    })
}

@Composable
fun BlogCategory(imgId: Int, title: String, subtitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        modifier = Modifier.padding(8.dp)

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.border(6.dp, Color.Cyan)
                            .padding(8.dp)

        ) {
            Image(
                painter = painterResource(id = imgId),
                contentDescription = "",
                modifier = Modifier
                    .size(58.dp)
                    .padding(4.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle, Modifier.weight(.8f))
        }

    }
}

@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            fontSize =18.sp,
            style = MaterialTheme.typography.labelLarge
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin,
            fontSize = 13.sp,
            style = MaterialTheme.typography.titleSmall
        )
    }
}

data class Category(val imgId: Int,val title: String, val subtitle: String)

fun getCategoryList(): MutableList<Category>{
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.profil,"Abhinandan","Verma"))
    list.add(Category(R.drawable.photo,"Verma","Abhinandan"))
    list.add(Category(R.drawable.trigo,"Trignometry","Formulas"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Google","Android Logo"))
    list.add(Category(R.drawable.profil,"Abhinandan","Verma"))
    list.add(Category(R.drawable.photo,"Verma","Abhinandan"))
    list.add(Category(R.drawable.trigo,"Trignometry","Formulas"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Google","Android Logo"))
    list.add(Category(R.drawable.photo,"Verma","Abhinandan"))
    list.add(Category(R.drawable.trigo,"Trignometry","Formulas"))
    list.add(Category(R.drawable.ic_launcher_foreground,"Google","Android Logo"))
    return list
}