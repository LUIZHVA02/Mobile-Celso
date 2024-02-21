package br.senai.sp.jandira.aula1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.aula1.ui.theme.Aula2KotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula2KotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    Column {
                        Tela("Nicolas", Color(0xfff))
                        Tela("G. H.", Color(0xff975780))
                    }
                }
            }
        }
    }
}

@Composable
fun Tela(texto : String, cor : Color) {
    Column {
        Text(text = "Olá $texto", fontSize = 32.sp, color = cor)
        Row {
            Button(onClick = { /*TODO*/ }) {
                Column {
                    Text(text = "Olá Mundo Real")
                }
            }
            Button(onClick = { /*TODO*/ }) {

            }
        }
    }
}