package br.senai.sp.jandira.navigateon.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LoginScreen(controleDeNavegacao: NavHostController) {
    var emailState = remember {
        mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }
    var mensagemErroState = remember {
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0xFF00FFF6),
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,
                modifier = Modifier.clickable {
                    controleDeNavegacao.navigate("home")
                }
            )
            Spacer(
                modifier = Modifier
                    .height(64.dp)
            )
            OutlinedTextField(
                value = emailState.value,
                onValueChange = {
                                emailState.value = it
                },
                label = {
                    Text(text = "Email")
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                )
            )
            Spacer(
                modifier = Modifier
                    .height(16.dp)
            )
            OutlinedTextField(
                value = senhaState.value,
                onValueChange = {
                                senhaState.value = it
                },
                label = {
                    Text(text = "Senha")
                },
                visualTransformation = PasswordVisualTransformation()
            )
            Text(
                text = mensagemErroState.value,
                color = Color.Red)
            Spacer(
                modifier = Modifier
                    .height(32.dp)
            )
            Button(
                onClick = {
                    if (emailState.value == "aluno" && senhaState.value == "1234"){
                        mensagemErroState.value = ""
                        controleDeNavegacao.navigate("Home")
                    } else {
                        mensagemErroState.value = "Email ou Senha foi digitado incorretamente"
                    }
                }
            ) {
                Text(text = "Entrar")
            }
        }
    }
}



@Preview(showSystemUi = true)
@Composable
fun PreviewLoginScreen() {
//    LoginScreen(controleDeNavegacao)
}