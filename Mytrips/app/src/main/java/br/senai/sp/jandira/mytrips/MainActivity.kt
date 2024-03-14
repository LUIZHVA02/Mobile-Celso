package br.senai.sp.jandira.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
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
            .background(Color.White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .height(50.dp)
                .width(400.dp),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Top
        ) {
            Column(
                modifier = Modifier

                    .height(50.dp)
                    .width(150.dp)
                    .background(
                        Color(0xffCF06F0),
                        shape = RoundedCornerShape(
                            bottomStart = 16.dp
                        )
                    )
            ) {}
        }
        Column(
            modifier = Modifier
                .height(500.dp)
                .width(350.dp),
        ) {
            Column(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    fontFamily = FontFamily.Default,
                    fontSize = 48.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xffCF06F0),
                    text = "Login"
                )
                Text(
                    fontFamily = FontFamily.Default,
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xffA09C9C),
                    text = "Please sign in to continue."
                )
            }
            Column(
                modifier = Modifier
                    .height(500.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Column(
                        modifier = Modifier
                            .height(200.dp)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        OutlinedTextField(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(75.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(0xffCF06F0),
                                focusedContainerColor = Color.White,
                                unfocusedBorderColor = Color(0xffCF06F0),
                                unfocusedContainerColor = Color.White
                            ),
                            shape = RoundedCornerShape(15.dp),
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 10.dp),
                                    fontFamily = FontFamily.Default,
                                    fontSize = 20.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Light,
                                    text = "Email"
                                )
                            },
                            leadingIcon = {
                                Card(
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                        .height(35.dp)
                                        .width(40.dp),
                                    colors = CardDefaults.cardColors(Color.Transparent),
                                    shape = RoundedCornerShape(0.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.email_icon),
                                        contentDescription = "uma seta para a direita",
                                        contentScale = ContentScale.FillBounds
                                    )
                                }
                            }
                        )

                        OutlinedTextField(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(75.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(0xffCF06F0),
                                focusedContainerColor = Color.White,
                                unfocusedBorderColor = Color(0xffCF06F0),
                                unfocusedContainerColor = Color.White
                            ),
                            shape = RoundedCornerShape(15.dp),
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 10.dp),
                                    fontFamily = FontFamily.Default,
                                    fontSize = 20.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Light,
                                    text = "Senha"
                                )
                            },
                            leadingIcon = {
                                Card(
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                        .height(40.dp)
                                        .width(35.dp),
                                    colors = CardDefaults.cardColors(Color.Transparent),
                                    shape = RoundedCornerShape(0.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.lock_icon),
                                        contentDescription = "uma seta para a direita",
                                        contentScale = ContentScale.FillBounds
                                    )
                                }
                            }
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .height(100.dp)
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .height(50.dp)
                            .width(400.dp),
                        horizontalAlignment = Alignment.End,
                        verticalArrangement = Arrangement.Top
                    ) {
                        Button(
                            onClick = {},
                            modifier = Modifier
                                .width(170.dp)
                                .height(50.dp)
                                .background(
                                    color = Color(0xffCF06F0),
                                    shape = RoundedCornerShape(15.dp)
                                ),
                            colors = ButtonDefaults.buttonColors(Color(0xffCF06F0))
                        ) {
                            Row(
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(170.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    fontFamily = FontFamily.Default,
                                    fontSize = 24.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Bold,
                                    text = "Sign in"
                                )
                                Card(
                                    modifier = Modifier
                                        .height(30.dp)
                                        .width(40.dp),
                                    colors = CardDefaults.cardColors(Color.Transparent),
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.seta_icon),
                                        contentDescription = "uma seta para a direita",
                                        contentScale = ContentScale.Fit
                                    )
                                }
                            }
                        }
                    }
                    Row(
                        modifier = Modifier
                            .height(30.dp)
                            .width(400.dp),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.Bottom
                    ) {
                        Text(
                            fontFamily = FontFamily.Default,
                            fontSize = 16.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xffA09C9C),
                            text = "Don’t have an account? "
                        )
                        Text(
                            fontFamily = FontFamily.Default,
                            fontSize = 16.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xffCF06F0),
                            text = "Sign up!"
                        )
                    }
                }
            }

        }


        Column(
            modifier = Modifier
                .height(50.dp)
                .width(400.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Bottom
        ) {
            Column(
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp)
                    .background(
                        Color(0xffCF06F0),
                        shape = RoundedCornerShape(
                            topEnd = 16.dp
                        )
                    )
            ) {}
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyTripsTheme {
        Greeting()
    }
}

@Composable
fun GreetingSignUp() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .height(50.dp)
                .width(400.dp),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.Top
        ) {
            Column(
                modifier = Modifier

                    .height(50.dp)
                    .width(150.dp)
                    .background(
                        Color(0xffCF06F0),
                        shape = RoundedCornerShape(
                            bottomStart = 16.dp
                        )
                    )
            ) {}
        }
        Column(
            modifier = Modifier
                .height(675.dp)
                .width(350.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Column (
                modifier = Modifier
                    .height(85.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Column(
                    modifier = Modifier
                        .height(85.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        fontFamily = FontFamily.Default,
                        fontSize = 48.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xffCF06F0),
                        text = "Sign Up"
                    )
                    Text(
                        fontFamily = FontFamily.Default,
                        fontSize = 16.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xffA09C9C),
                        text = "Create a new account!"
                    )
                }


            }


            Column(
                modifier = Modifier
                    .height(500.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .height(350.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier = Modifier
                            .height(550.dp)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        OutlinedTextField(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(75.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(0xffCF06F0),
                                focusedContainerColor = Color.White,
                                unfocusedBorderColor = Color(0xffCF06F0),
                                unfocusedContainerColor = Color.White
                            ),
                            shape = RoundedCornerShape(15.dp),
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 10.dp),
                                    fontFamily = FontFamily.Default,
                                    fontSize = 20.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Light,
                                    text = "Email"
                                )
                            },
                            leadingIcon = {
                                Card(
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                        .height(35.dp)
                                        .width(40.dp),
                                    colors = CardDefaults.cardColors(Color.Transparent),
                                    shape = RoundedCornerShape(0.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.email_icon),
                                        contentDescription = "Um icone roxo de email",
                                        contentScale = ContentScale.FillBounds
                                    )
                                }
                            }
                        )

                        OutlinedTextField(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(75.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(0xffCF06F0),
                                focusedContainerColor = Color.White,
                                unfocusedBorderColor = Color(0xffCF06F0),
                                unfocusedContainerColor = Color.White
                            ),
                            shape = RoundedCornerShape(15.dp),
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 10.dp),
                                    fontFamily = FontFamily.Default,
                                    fontSize = 20.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Light,
                                    text = "Senha"
                                )
                            },
                            leadingIcon = {
                                Card(
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                        .height(40.dp)
                                        .width(35.dp),
                                    colors = CardDefaults.cardColors(Color.Transparent),
                                    shape = RoundedCornerShape(0.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.lock_icon),
                                        contentDescription = "Um cadeado roxo",
                                        contentScale = ContentScale.FillBounds
                                    )
                                }
                            }
                        )
                        OutlinedTextField(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(75.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(0xffCF06F0),
                                focusedContainerColor = Color.White,
                                unfocusedBorderColor = Color(0xffCF06F0),
                                unfocusedContainerColor = Color.White
                            ),
                            shape = RoundedCornerShape(15.dp),
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 10.dp),
                                    fontFamily = FontFamily.Default,
                                    fontSize = 20.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Light,
                                    text = "Email"
                                )
                            },
                            leadingIcon = {
                                Card(
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                        .height(35.dp)
                                        .width(40.dp),
                                    colors = CardDefaults.cardColors(Color.Transparent),
                                    shape = RoundedCornerShape(0.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.email_icon),
                                        contentDescription = "Um icone roxo de email",
                                        contentScale = ContentScale.FillBounds
                                    )
                                }
                            }
                        )

                        OutlinedTextField(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(75.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color(0xffCF06F0),
                                focusedContainerColor = Color.White,
                                unfocusedBorderColor = Color(0xffCF06F0),
                                unfocusedContainerColor = Color.White
                            ),
                            shape = RoundedCornerShape(15.dp),
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 10.dp),
                                    fontFamily = FontFamily.Default,
                                    fontSize = 20.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Light,
                                    text = "Senha"
                                )
                            },
                            leadingIcon = {
                                Card(
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                        .height(40.dp)
                                        .width(35.dp),
                                    colors = CardDefaults.cardColors(Color.Transparent),
                                    shape = RoundedCornerShape(0.dp)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.lock_icon),
                                        contentDescription = "Um cadeado roxo",
                                        contentScale = ContentScale.FillBounds
                                    )
                                }
                            }
                        )
                    }
                }
                Column {
                    Column(
                        modifier = Modifier
                            .height(80.dp)
                            .fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier
                                .height(50.dp)
                                .width(400.dp),
                            horizontalAlignment = Alignment.End,
                            verticalArrangement = Arrangement.Top
                        ) {
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(50.dp)
                                    .background(
                                        color = Color(0xffCF06F0),
                                        shape = RoundedCornerShape(15.dp)
                                    ),
                                colors = ButtonDefaults.buttonColors(Color(0xffCF06F0))
                            ) {
                                Row(
                                    modifier = Modifier
                                        .height(50.dp)
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        fontFamily = FontFamily.Default,
                                        fontSize = 24.sp,
                                        fontStyle = FontStyle.Normal,
                                        fontWeight = FontWeight.Bold,
                                        text = "Create Account"
                                    )
                                }
                            }
                        }
                        Row(
                            modifier = Modifier
                                .height(30.dp)
                                .width(400.dp),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                fontFamily = FontFamily.Default,
                                fontSize = 16.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xffA09C9C),
                                text = "Already have an account? "
                            )
                            Text(
                                fontFamily = FontFamily.Default,
                                fontSize = 16.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xffCF06F0),
                                text = "Sign in!"
                            )
                        }
                    }
                }
            }

        }

        Column(
            modifier = Modifier
                .height(50.dp)
                .width(400.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Bottom
        ) {
            Column(
                modifier = Modifier
                    .height(50.dp)
                    .width(150.dp)
                    .background(
                        Color(0xffCF06F0),
                        shape = RoundedCornerShape(
                            topEnd = 16.dp
                        )
                    )
            ) {}
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingSignUpPreview() {
    MyTripsTheme {
        GreetingSignUp()
    }
}