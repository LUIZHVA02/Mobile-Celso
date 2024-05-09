package br.senai.sp.jandira.navigateon.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(controleDeNavegacao: NavHostController) {
    Surface (
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0xFF0FFF6F)
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text = "Bem-Vindo a Tela Home!!!",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(
                    modifier = Modifier
                        .height(16.dp)
                    )
            Button(onClick = {controleDeNavegacao.navigate("Login")}) {
                Text(text = "Voltar para a tela de Login")
            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun PreviewHomeScreen() {
//    HomeScreen(controleDeNavegacao)
}
