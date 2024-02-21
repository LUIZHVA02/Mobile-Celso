package br.senai.sp.jandira.logindsa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.logindsa.ui.theme.LoginDSATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginDSATheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), 
                    color = Color(0xff673AB7)
                
                ) {
                    TelaLogin()
                }
            }
        }
    }
}
@Composable
fun TelaLogin(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color(0xff673AB7)
            )
            .padding(24.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Login",
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Box (
            modifier = Modifier
                .background(
                    color = Color(0xFF9E5DE0),
                    shape = RoundedCornerShape(16.dp)
                )
        ){
            Column (
                modifier = Modifier
                    .padding(24.dp)
            ){
                Text(
                    color = Color.White,
                    text = "E-mail:",
                    modifier = Modifier
                        .padding(top = 24.dp)
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp)
                )
                Text(
                    color = Color.White,
                    text = "Senha:",
                    modifier = Modifier
                        .padding(top = 24.dp)
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()

                )

                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ){
                    Checkbox(
                        checked = true,
                        onCheckedChange = {})
                    Text(

                        text = "Lembrar"
                    )
                }
            }
        }

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = ButtonDefaults
                .buttonColors(containerColor = Color(0xFF9E5DE0))
        ) {
            Text(
                text = "Entrar",
                color = Color.White,
                fontSize = 36.sp
            )
        }
        Text(text = "Desenvolvido por DSAIT-A")

    }
}
@Preview(showSystemUi = true)
@Composable
fun TelaLoginPreview() {
    LoginDSATheme {
        TelaLogin()
    }
}

@Composable
fun Teste(){
    Surface(
        modifier = Modifier
            .height(200.dp)
            .width(200.dp),
        color = Color(0xFF9C1ECA)

    ) {
        Box (
            modifier = Modifier
                .padding(end = 16.dp)
                .background(
                    color = Color(0xFFF44336)
                )

        ){
            Column (
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally

            ){
                Text(text = "SENAI")
                Text(text = "SESI")
                Text(text = "SENAI")
                Text(text = "SENAI")
                Text(text = "SESI")
                Row {
                    Button(onClick = { /*TODO*/ }) {
                        
                    }
                    Button(onClick = { /*TODO*/ }) {
                        
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TestPreview(){
    LoginDSATheme {
        Teste()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginDSATheme {
        Greeting("Android")
    }
}