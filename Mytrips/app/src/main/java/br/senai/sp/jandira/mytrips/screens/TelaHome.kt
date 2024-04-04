package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

@Composable
fun TelaHome() {
    var pesquisaHomeState = remember {
        mutableStateOf("")
    }
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        ) {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            ){
                Card (){
                    Image(
                        painter = painterResource(id = R.drawable.foto_susana),
                        contentDescription = "")
                }
                Text(text = "Susanna Hoffs")
            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            ){
                Column (){
                    Image(
                        painter = painterResource(id = R.drawable.location_icon),
                        contentDescription = "")
                    Text(text = "You're in Paris")
                }
                Text(text = "My Trips")
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