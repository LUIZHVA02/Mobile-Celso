package br.senai.sp.jandira.projetoimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.projetoimc.ui.theme.ProjetoIMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetoIMCTheme {
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
    Column(
        modifier = Modifier
            .fillMaxSize(),

    ){
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(170.dp)
                .background(color = Color(0xFFED145B)),
        ){}
        Column (
            modifier = Modifier
                .offset(x = 0.dp, y = -150.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column (
                modifier = Modifier
                    .height(120.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                    ,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Card (
                        modifier = Modifier
                            .width(70.dp)
                            .height(70.dp),
                        shape = CircleShape
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.bmi),
                            contentDescription = "",
                            contentScale = ContentScale.Fit)
                    }
                    Text(
                        color = Color(0xFFFFFFFF),
                        fontSize = 32.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        text = "Calculadora IMC"
                    )
                }
            }
            Column (
                modifier = Modifier
                    .height(370.dp)
                    .width(300.dp)
                    .shadow(
                        elevation = 5.dp,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .border(
                        2.dp,
                        color = Color.Transparent,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .background(
                        color = Color(0xFFE8E8E8),
                        shape = RoundedCornerShape(10.dp)
                    ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround

            ){
                Text(
                    color = Color(0xFFED145B),
                    fontSize = 30.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    text = "Seus dados",

                )

                Column (
                    modifier = Modifier
                        .height(180.dp)
                        .width(250.dp),
                    verticalArrangement = Arrangement.SpaceBetween

                ){
                    Column (
                        modifier = Modifier
                            .width(250.dp)
                    ){

                        Text(
                            color = Color(0xFFED145B),
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Normal,
                            text = "Seu peso:"
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            placeholder = {
                                Text(
                                    text = "Sua altura em cm"
                                )
                            },
                            modifier = Modifier
                                .height(60.dp)
                                .width(250.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color.Red,
                                focusedContainerColor = Color.White,
                                unfocusedBorderColor = Color.Red,
                                unfocusedContainerColor = Color.White
                            ),
                            shape = RoundedCornerShape(12.dp)

                        )

                    }

                    Column (
                        modifier = Modifier
                            .width(250.dp)
                    ){

                        Text(
                            color = Color(0xFFED145B),
                            fontSize = 20.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Normal,
                            text = "Sua altura:"
                        )
                            OutlinedTextField(
                                value = "",
                                onValueChange = {},
                                placeholder = {
                                    Text(
                                        text = "Sua altura em cm"
                                    )
                                },
                                modifier = Modifier
                                    .height(60.dp)
                                    .width(250.dp),
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedBorderColor = Color.Red,
                                    focusedContainerColor = Color.White,
                                    unfocusedBorderColor = Color.Red,
                                    unfocusedContainerColor = Color.White
                                ),
                                shape = RoundedCornerShape(12.dp)

                            )

                    }
                }
                Button(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .height(60.dp)
                        .width(250.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        Color(0xFFED145B)
                    )

                ) {
                    Text(
                        text = "CALCULAR",
                        fontSize = 24.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                    )
                }

            }

            Row (
                modifier = Modifier
                    .height(100.dp)
                    .width(300.dp)
                    .shadow(
                        elevation = 5.dp,
                        shape = RoundedCornerShape(10.dp),
                    )
                    .background(
                        color = Color(0xF1329F6B),
                        shape = RoundedCornerShape(10.dp),
                    )
                    .border(
                        border = BorderStroke(
                            width = 1.dp,
                            color = Color(0xFFED145B),
                        ),
                        shape = RoundedCornerShape(10.dp)
                    ),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,

                ){
                Column (
                    modifier = Modifier
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Text(
                        color = Color(0xFFFFFFFF),
                        fontSize = 16.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Normal,
                        text = "Resultado"
                    )
                    Text(
                        color = Color(0xFFFFFFFF),
                        fontSize = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Normal,
                        text = "Peso Ideal"
                    )
                }
                Column (
                    modifier = Modifier
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Text(
                        color = Color(0xFFFFFFFF),
                        fontSize = 36.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        text = "21.3"
                    )
                }

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ProjetoIMCTheme {
        Greeting()
    }
}

@Composable
fun Second() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.projeto_calculadora_imc),
            contentDescription = "Uma tela com um formulário de IMC",
            modifier = Modifier
                .height(600.dp)
                .width(600.dp),
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SecondPreview() {
    ProjetoIMCTheme {
        Second()
    }
}