package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

@Composable
fun TelaCadastro(controleDeNavegacao: NavHostController) {
    var nomeSignUpState = remember {
        mutableStateOf("")
    }
    var foneSignUpState = remember {
        mutableStateOf("")
    }
    var emailSignUpState = remember {
        mutableStateOf("")
    }
    var senhaSignUpState = remember {
        mutableStateOf("")
    }
    var checkBoxSignUpState = remember {
        mutableStateOf(false)
    }
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
            Column(
                modifier = Modifier
                    .height(190.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .height(75.dp)
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        fontFamily = FontFamily.Default,
                        fontSize = 40.sp,
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
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ){
                    Card(
                        modifier = Modifier
                            .size(width = 100.dp, height = 100.dp)
                            .background(Color(0x00F6F6F6)),
                        shape = CircleShape,
                        border = BorderStroke(
                            width = 2.dp,
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(0xffCF06F0),
                                    Color(0xffffffff)
                                ),
                            )
                        )
                    ) {
                        Image(
                            modifier = Modifier
                                .offset(x =12.dp, y = 8.dp)
                                .height(72.dp)
                                .width(72.dp),
                            painter = painterResource(id = R.drawable.perfil_icon_2),
                            contentDescription = "",
                            alignment = Alignment.Center,
                            contentScale = ContentScale.Crop
                        )
                    }
                    Image(
                        modifier = Modifier
                            .offset(x = -28.dp, y = 36.dp)
                            .height(30.dp)
                            .width(30.dp),
                        painter = painterResource(id = R.drawable.camera_icon),
                        contentDescription = "",
                        alignment = Alignment.BottomEnd,
                    )
                }
            }

            Column(
                modifier = Modifier
                    .height(450.dp)
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .height(450.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier = Modifier
                            .height(300.dp)
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
                            value = nomeSignUpState.value,
                            onValueChange = {
                                nomeSignUpState.value = it
                            },
                            label = {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 10.dp),
                                    fontFamily = FontFamily.Default,
                                    fontSize = 20.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Light,
                                    text = "Nome"
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Text
                            ),
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
                                        painter = painterResource(id = R.drawable.perfil_icon),
                                        contentDescription = "Um icone roxo de usuário",
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
                            value = foneSignUpState.value,
                            onValueChange = {
                                foneSignUpState.value = it
                            },
                            label = {
                                Text(
                                    modifier = Modifier
                                        .padding(start = 10.dp),
                                    fontFamily = FontFamily.Default,
                                    fontSize = 20.sp,
                                    fontStyle = FontStyle.Normal,
                                    fontWeight = FontWeight.Light,
                                    text = "Telefone"
                                )
                            },
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Phone
                            ),
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
                                        painter = painterResource(id = R.drawable.phone_icon),
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
                            value = emailSignUpState.value,
                            onValueChange = {
                                emailSignUpState.value = it
                            },
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
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Email
                            ),
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
                            value = senhaSignUpState.value,
                            onValueChange = {
                                senhaSignUpState.value = it
                            },
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
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Password
                            ),
                            visualTransformation = PasswordVisualTransformation(),
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
                    Row(
                        modifier = Modifier
                            .height(50.dp)
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = checkBoxSignUpState.value,
                            onCheckedChange = {
                                checkBoxSignUpState.value = it
                            },
                            modifier = Modifier
                                .height(50.dp)
                                .width(50.dp),
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color(0xffCF06F0),
                                uncheckedColor = Color(0xffCF06F0),
                                checkmarkColor = Color(0xffffffff)
                            )
                        )

                        Text(text = "Over 18?")
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
                                    onClick = {
                                              controleDeNavegacao.navigate("Home")
                                    },
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
                                    text = "Sign in!",
                                    modifier = Modifier.clickable {
                                        controleDeNavegacao.navigate("Login")
                                    }
                                )
                            }
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
fun TelaCadastroPreview() {
    MyTripsTheme {
//        TelaCadastro(controleDeNavegacao)
    }
}