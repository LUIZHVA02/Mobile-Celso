package br.senai.sp.jandira.deadpool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.deadpool.ui.theme.DeadpoolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeadpoolTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Image(
        painter = painterResource(id = R.drawable.foto_deadpool_2),
        contentDescription = "",
        contentScale = ContentScale.FillWidth

    )
    Column(
        modifier = Modifier
            .background(Color(0x88000000))
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Botão de Busca",
                        tint = Color(0xFF9B0B0B)
                    )
                }
            },
            placeholder = {
                Text(
                    text = "Buscar por Membros da Equipe",
                    color = Color(0xff9b0b0b)
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color(0xBEffffff),
                focusedBorderColor = Color(0xFF9B0B0B),
                unfocusedContainerColor = Color(0xBEFFFFFF),
                unfocusedBorderColor = Color(0xFF9B0B0B)
            )
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Colegas da Equipe Força X",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xffffffff)
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(1) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(bottom = 16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xaa9b0b0b)
                    ),
                    border = BorderStroke(
                        width = 3.dp,
                        brush = Brush.horizontalGradient(
                            listOf(
                                Color(0xffffffff),
                                Color(0xff000000)
                            ),
                        )
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Card(
                            modifier = Modifier
                                .size(width = 100.dp, height = 100.dp),
                            shape = CircleShape
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.fundo_deadpool),
                                contentDescription = "",
                                contentScale = ContentScale.Crop
                            )
                        }
                        Column(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp),
                            verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                text = "Deadpool",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xffffffff),
                                letterSpacing = 1.sp
                            )

                            Text(
                                text = "O mercenário tagarela, o pesadelo do Titã Louco",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xffffffff),
                                lineHeight = 20.sp
                            )
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(bottom = 16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xaa9b0b0b)
                    ),
                    border = BorderStroke(
                        width = 3.dp,
                        brush = Brush.horizontalGradient(
                            listOf(
                                Color(0xffffffff),
                                Color(0xff000000)
                            ),
                        )
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Card(
                            modifier = Modifier
                                .size(width = 100.dp, height = 100.dp),
                            shape = CircleShape
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.fundo_deadpool),
                                contentDescription = "",
                                contentScale = ContentScale.Crop
                            )
                        }
                        Column(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp),
                            verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                text = "Deadpool",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xffffffff),
                                letterSpacing = 1.sp
                            )

                            Text(
                                text = "O mercenário tagarela, o pesadelo do Titã Louco",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xffffffff),
                                lineHeight = 20.sp
                            )
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(bottom = 16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xaa9b0b0b)
                    ),
                    border = BorderStroke(
                        width = 3.dp,
                        brush = Brush.horizontalGradient(
                            listOf(
                                Color(0xffffffff),
                                Color(0xff000000)
                            ),
                        )
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Card(
                            modifier = Modifier
                                .size(width = 100.dp, height = 100.dp),
                            shape = CircleShape
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.fundo_deadpool),
                                contentDescription = "",
                                contentScale = ContentScale.Crop
                            )
                        }
                        Column(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp),
                            verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                text = "Deadpool",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xffffffff),
                                letterSpacing = 1.sp
                            )

                            Text(
                                text = "O mercenário tagarela, o pesadelo do Titã Louco",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xffffffff),
                                lineHeight = 20.sp
                            )
                        }
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(bottom = 16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xaa9b0b0b)
                    ),
                    border = BorderStroke(
                        width = 3.dp,
                        brush = Brush.horizontalGradient(
                            listOf(
                                Color(0xffffffff),
                                Color(0xff000000)
                            ),
                        )
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Card(
                            modifier = Modifier
                                .size(width = 100.dp, height = 100.dp),
                            shape = CircleShape
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.fundo_deadpool),
                                contentDescription = "",
                                contentScale = ContentScale.Crop
                            )
                        }
                        Column(
                            modifier = Modifier
                                .height(100.dp)
                                .width(200.dp),
                            verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.Start
                        ) {
                            Text(
                                text = "Deadpool",
                                fontSize = 28.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xffffffff),
                                letterSpacing = 1.sp
                            )

                            Text(
                                text = "O mercenário tagarela, o pesadelo do Titã Louco",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xffffffff),
                                lineHeight = 20.sp
                            )
                        }
                    }
                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .padding(bottom = 16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xaa9b0b0b)
                        ),
                        border = BorderStroke(
                            width = 3.dp,
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(0xffffffff),
                                    Color(0xff000000)
                                ),
                            )
                        )
                    ){
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Card (
                                modifier = Modifier
                                    .size(width = 100.dp, height = 100.dp),
                                shape = CircleShape
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.fundo_deadpool),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop)
                            }
                            Column (
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(200.dp),
                                verticalArrangement = Arrangement.SpaceEvenly,
                                horizontalAlignment = Alignment.Start
                            ){
                                Text(
                                    text = "Deadpool",
                                    fontSize = 28.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xffffffff),
                                    letterSpacing = 1.sp
                                )

                                Text(
                                    text = "O mercenário tagarela, o pesadelo do Titã Louco",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xffffffff),
                                    lineHeight = 20.sp
                                )
                            }
                        }
                    }
                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .padding(bottom = 16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xaa9b0b0b)
                        ),
                        border = BorderStroke(
                            width = 3.dp,
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(0xffffffff),
                                    Color(0xff000000)
                                ),
                            )
                        )
                    ){
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Card (
                                modifier = Modifier
                                    .size(width = 100.dp, height = 100.dp),
                                shape = CircleShape
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.fundo_deadpool),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop)
                            }
                            Column (
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(200.dp),
                                verticalArrangement = Arrangement.SpaceEvenly,
                                horizontalAlignment = Alignment.Start
                            ){
                                Text(
                                    text = "Deadpool",
                                    fontSize = 28.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xffffffff),
                                    letterSpacing = 1.sp
                                )

                                Text(
                                    text = "O mercenário tagarela, o pesadelo do Titã Louco",
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xffffffff),
                                    lineHeight = 20.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    DeadpoolTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting()
        }
    }
}