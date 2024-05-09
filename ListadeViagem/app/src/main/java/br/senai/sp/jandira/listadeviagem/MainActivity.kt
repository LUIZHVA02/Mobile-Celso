package br.senai.sp.jandira.listadeviagem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.listadeviagem.repository.ViagemRepository
import br.senai.sp.jandira.listadeviagem.ui.theme.ListaDeViagemTheme
import br.senai.sp.jandira.listadeviagem.utils.encurtartarData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaDeViagemTheme {
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

    val viagens = ViagemRepository().listarTodaAsViagens()



    Surface {
        LazyColumn {
            items(viagens){
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            horizontal = 16.dp,
                            vertical = 4.dp
                        )
                ) {
                    Column (
                        modifier = Modifier
                            .fillMaxWidth()
                    ){
                        Surface (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(180.dp)
                        ){
                            Image(
                                painter = if(it.imagem == null) painterResource(id = R.drawable.no_image) else it.imagem!!,
                                contentDescription ="",
                                contentScale = ContentScale.Crop
                            )
                        }
                        Column (
                            modifier = Modifier
                                .padding(8.dp),
                            verticalArrangement = Arrangement.SpaceBetween
                        ){
                            Text(
                                text = it.descricao
                            )
                            Spacer(
                                modifier = Modifier
                                    .height(8.dp)
                            )
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Row (
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ){
                                    Icon(
                                        imageVector = Icons.Default.Place,
                                        contentDescription = "",
                                        tint = Color.Blue
                                    )
                                    Text(text = "${it.destino}, ${it.dataChegada.year}")
                                }
                                Row (
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ){
                                    Text(
                                        text = "${encurtartarData(it.dataChegada)} - ${encurtartarData(it.dataPartida)}"
                                    )
                                }
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
    ListaDeViagemTheme {
        Greeting()
    }
}