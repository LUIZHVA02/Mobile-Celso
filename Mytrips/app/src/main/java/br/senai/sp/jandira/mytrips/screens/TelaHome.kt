package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.BeachAccess
import androidx.compose.material.icons.rounded.DownhillSkiing
import androidx.compose.material.icons.rounded.Snowboarding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

@Composable
fun TelaHome() {
    var pesquisaHomeState = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(0xFFE8E8E8)
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Surface(
            modifier = Modifier
                .height(240.dp)
                .fillMaxWidth(),
            shape = RectangleShape,

            ) {
            Image(
                painter = painterResource(id = R.drawable.foto_paris),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .width(400.dp)
                    .height(240.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Column(
                        modifier = Modifier
                            .width(360.dp)
                            .height(90.dp),
                        horizontalAlignment = Alignment.End,
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        Card(
                            modifier = Modifier
                                .width(64.dp)
                                .height(64.dp),
                            shape = CircleShape
                        ) {
                            Image(

                                painter = painterResource(id = R.drawable.foto_susana),
                                contentDescription = ""
                            )
                        }
                        Text(
                            fontFamily = FontFamily.Default,
                            fontSize = 18.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Light,
                            color = Color.White,
                            text = "Susanna Hoffs",
                        )
                    }

                }

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Column(
                        modifier = Modifier
                            .width(360.dp)
                            .height(90.dp),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(32.dp),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.location_icon),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(24.dp),
                                tint = Color(0xffffffff)
                            )
                            Text(
                                fontFamily = FontFamily.Default,
                                fontSize = 20.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Light,
                                color = Color.White,
                                text = "You're in Paris"
                            )
                        }
                        Text(
                            fontFamily = FontFamily.Default,
                            fontSize = 28.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            text = "My Trips"
                        )
                    }
                }
            }
        }
        Column(
            modifier = Modifier
                .width(360.dp)
                .height(120.dp)
        ) {
            Text(
                fontFamily = FontFamily.Default,
                fontSize = 20.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                color = Color(0xff565454),
                text = "Categories"
            )
            LazyRow(
                modifier = Modifier.fillMaxWidth()
            ) {
                items(2) {
                    Column(
                        modifier = Modifier
                            .height(90.dp)
                            .width(120.dp)
                            .background(
                                color = Color(0xffCF06F0),
                                shape = RoundedCornerShape(20.dp)
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Card(
                            modifier = Modifier
                                .height(50.dp)
                                .width(50.dp),
                            colors = CardDefaults.cardColors(Color(0x00FFFFFF)),
                            shape = CircleShape
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.montanha_branca),
                                contentDescription = "",
                                contentScale = ContentScale.Crop
                            )
                        }
                        Text(
                            fontFamily = FontFamily.Default,
                            fontSize = 20.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            color = Color.White,
                            text = "Montain"
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        modifier = Modifier
                            .height(90.dp)
                            .width(120.dp)
                            .background(
                                color = Color(0xffCF06F0),
                                shape = RoundedCornerShape(20.dp)
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Card(
                            modifier = Modifier
                                .height(50.dp)
                                .width(50.dp),
                            colors = CardDefaults.cardColors(Color(0x00FFFFFF)),
                            shape = CircleShape
                        ) {
                            Icon(

                                Icons.Rounded.DownhillSkiing,
                                contentDescription = "",
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp),
                                tint = Color.White,
                            )
                        }
                        Text(
                            fontFamily = FontFamily.Default,
                            fontSize = 20.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            color = Color.White,
                            text = "Snow"
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        modifier = Modifier
                            .height(90.dp)
                            .width(120.dp)
                            .background(
                                color = Color(0xffCF06F0),
                                shape = RoundedCornerShape(20.dp)
                            ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Card(
                            modifier = Modifier
                                .height(50.dp)
                                .width(50.dp),
                            colors = CardDefaults.cardColors(Color(0x00FFFFFF)),
                            shape = CircleShape
                        ) {
                            Icon(
                                Icons.Rounded.BeachAccess,
                                contentDescription = "",
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp),
                                tint = Color.White
                            )
                        }
                        Text(
                            fontFamily = FontFamily.Default,
                            fontSize = 20.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Normal,
                            color = Color.White,
                            text = "Beach"
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
        }

        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .width(360.dp)
                .height(64.dp),
            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Botão de Busca",
                        tint = Color(0xFFB7B7B7)
                    )
                }
            },
            placeholder = {
                Text(
                    fontFamily = FontFamily.Default,
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Normal,
                    text = "Search your destiny",
                    color = Color(0xFFA09C9C)
                )
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0xBEffffff),
                unfocusedContainerColor = Color(0xBEFFFFFF),
            )
        )
        Column (
            modifier = Modifier
                .width(360.dp)
                .height(300.dp)
        ){
            Text(
                fontFamily = FontFamily.Default,
                fontSize = 20.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Normal,
                color = Color(0xff565454),
                text = "Past Trips"
            )
            LazyColumn(modifier = Modifier
                .fillMaxSize()){
                items(1){
                    Column (
                        modifier = Modifier
                            .width(360.dp)
                            .height(220.dp)
                            .shadow(
                                5.dp,
                                shape = RoundedCornerShape(15.dp))
                            .background(
                                color = Color.White
                            ),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Card (
                            modifier = Modifier
                                .width(340.dp)
                                .height(100.dp)){
                            Image(
                                painter = painterResource(id = R.drawable.foto_londres),
                                contentDescription = "",
                                contentScale = ContentScale.Crop)
                        }
                        Column (
                            modifier = Modifier
                                .width(340.dp)
                                .height(90.dp),

                        ){
                            Column (
                                modifier = Modifier
                                .width(340.dp),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.Start){
                                Text(
                                    fontFamily = FontFamily.Default,
                                    fontSize = 20.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Normal,
                                    color = Color(0xffCF06F0),
                                    text = "London, 2019")
                            }
                            Column {
                                Text(
                                    fontFamily = FontFamily.Default,
                                    fontSize = 14.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Normal,
                                    color = Color(0xff565454),
                                    text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.")
                            }
                            Column (
                                modifier = Modifier
                                    .width(340.dp),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.End
                                    ){
                                Text(
                                    fontFamily = FontFamily.Default,
                                    fontSize = 14.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Normal,
                                    color = Color(0xffCF06F0),
                                    text = "18 Feb - 21 Feb")
                            }
                        }
//                        Spacer(
//                            modifier = Modifier
//                                .height(16.dp)
//                        )
                    }

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaHomePreview() {
    MyTripsTheme {
        TelaHome()
    }
}