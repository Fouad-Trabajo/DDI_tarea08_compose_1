package com.example.tarea08compose1ddi

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                TopAppBar()
                Row(modifier = Modifier.fillMaxWidth()) {
                    HeadText(stringResource(id = R.string.featured))
                    HeadText(stringResource(id = R.string.buy_category))
                }
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .weight(1f),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically){

                    Text(stringResource(id = R.string.home), modifier = Modifier.weight(1f))
                    Images(R.drawable.img_01)
                    Images(R.drawable.img_02)
                    Images(R.drawable.img_03)
                }
                Row(modifier = Modifier.padding(10.dp)){
                    Text(stringResource(R.string.clothe_women), modifier = Modifier.width(80.dp))
                    Text(
                        stringResource(R.string.make_up),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        stringResource(R.string.shirt_women),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        stringResource(R.string.shoes_women),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                }
                Row(modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically){
                    Text(stringResource(R.string.sizes_women), modifier = Modifier.weight(1f))
                    Images(R.drawable.img_04)
                    Images(R.drawable.img_05)
                    Images(R.drawable.img_06)
                }
                Row(modifier = Modifier.padding(10.dp)){
                    Text(stringResource(R.string.shoes_women), modifier = Modifier.weight(1f))
                    Text(
                        stringResource(R.string.dress_women),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        stringResource(R.string.tools),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        stringResource(R.string.hair),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                }
                Row(modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically){
                    Text(stringResource(R.string.pajamas_women), modifier = Modifier.weight(1f))
                    Images(R.drawable.img_07)
                    Images(R.drawable.img_08)
                    Images(R.drawable.img_09)
                }
                Row(modifier = Modifier.padding(10.dp)){
                    Text(stringResource(R.string.clothes_men), modifier = Modifier.weight(1f))
                    Text(
                        stringResource(R.string.personal_care),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        stringResource(R.string.top_men),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        stringResource(R.string.men_sets),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                }
                Row(modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(10.dp),
                    verticalAlignment = Alignment.CenterVertically){
                    Text(stringResource(R.string.shoes_men), modifier = Modifier.weight(1f))
                    Images(R.drawable.img_10)
                    Images(R.drawable.img_12)
                    Images(R.drawable.img_11)
                }
                Row(modifier = Modifier.padding(10.dp)){
                    Text(stringResource(R.string.sizes_men), modifier = Modifier.weight(1f))
                    Text(
                        stringResource(R.string.clothes_men),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        stringResource(R.string.tools_fitness),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        stringResource(R.string.electro_games),
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar() {
    val context = LocalContext.current
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = {  }) {
                Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = null)
            }
        },
        title = { Text(text = "Busqueda") },
        actions = {
            Icon(
                imageVector = Icons.Rounded.Home,
                contentDescription = null
            )
            IconButton(onClick = {
                Toast.makeText(context, "Has pulsado el botón de busqueda",Toast.LENGTH_LONG).show()}) {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = null
                )
            }
        }
    )
}

@Composable
fun HeadText(text: String) {
    Text(
        text = text,
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp,
        modifier = Modifier.padding(10.dp)
    )
}

@Composable
fun Images(img: Int){
    Image(
        painterResource(id = img),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(100.dp)
            .clip(CircleShape)
    )
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Column(modifier = Modifier.fillMaxSize()) {
        TopAppBar()
        Row(modifier = Modifier.fillMaxWidth()) {
            HeadText(stringResource(id = R.string.featured))
            HeadText(stringResource(id = R.string.buy_category))
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .weight(1f),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically){

            Text(stringResource(id = R.string.home), modifier = Modifier.weight(1f))
            Images(R.drawable.img_01)
            Images(R.drawable.img_02)
            Images(R.drawable.img_03)
        }
        Row(modifier = Modifier.padding(10.dp)){
            Text(stringResource(R.string.clothe_women), modifier = Modifier.width(80.dp))
            Text(
                stringResource(R.string.make_up),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
            Text(
                stringResource(R.string.shirt_women),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
            Text(
                stringResource(R.string.shoes_women),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
        }
        Row(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically){
            Text(stringResource(R.string.sizes_women), modifier = Modifier.weight(1f))
            Images(R.drawable.img_04)
            Images(R.drawable.img_05)
            Images(R.drawable.img_06)
        }
        Row(modifier = Modifier.padding(10.dp)){
            Text(stringResource(R.string.shoes_women), modifier = Modifier.weight(1f))
            Text(
                stringResource(R.string.dress_women),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
            Text(
                stringResource(R.string.tools),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
            Text(
                stringResource(R.string.hair),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
        }
        Row(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically){
            Text(stringResource(R.string.pajamas_women), modifier = Modifier.weight(1f))
            Images(R.drawable.img_07)
            Images(R.drawable.img_08)
            Images(R.drawable.img_09)
        }
        Row(modifier = Modifier.padding(10.dp)){
            Text(stringResource(R.string.clothes_men), modifier = Modifier.weight(1f))
            Text(
                stringResource(R.string.personal_care),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
            Text(
                stringResource(R.string.top_men),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
            Text(
                stringResource(R.string.men_sets),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
        }
        Row(modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
            .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically){
            Text(stringResource(R.string.shoes_men), modifier = Modifier.weight(1f))
            Images(R.drawable.img_10)
            Images(R.drawable.img_12)
            Images(R.drawable.img_11)
        }
        Row(modifier = Modifier.padding(10.dp)){
            Text(stringResource(R.string.sizes_men), modifier = Modifier.weight(1f))
            Text(
                stringResource(R.string.clothes_men),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
            Text(
                stringResource(R.string.tools_fitness),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
            Text(
                stringResource(R.string.electro_games),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
        }
    }
}