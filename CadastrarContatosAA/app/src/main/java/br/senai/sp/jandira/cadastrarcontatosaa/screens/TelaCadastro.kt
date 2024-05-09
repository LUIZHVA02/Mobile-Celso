package br.senai.sp.jandira.cadastrarcontatosaa.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.QuestionMark
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.cadastrarcontatosaa.R
import br.senai.sp.jandira.cadastrarcontatosaa.model.Contato
import br.senai.sp.jandira.cadastrarcontatosaa.repository.ContatoRepository

@Composable
fun TelaCadastro() {
    var nomeContatoState = remember {
        mutableStateOf("")
    }
    var telefoneContatoState = remember {
        mutableStateOf("")
    }
    var emailContatoState = remember {
        mutableStateOf("")
    }
    var dataNascimentoContatoState = remember {
        mutableStateOf("")
    }
    var isAmigoContatoState = remember {
        mutableStateOf(false)
    }

    val cr = ContatoRepository(LocalContext.current)

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0xFFDA2222)
    ) {
        Card(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)

            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Card(
                        modifier = Modifier
                            .size(
                                width = 32.dp,
                                height = 32.dp
                            ),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF000000)
                        )
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowBackIosNew,
                                contentDescription = "",
                                tint = Color.White
                            )
                        }
                    }
                    Box(
                        contentAlignment = Alignment.BottomEnd,
                        modifier = Modifier
                            .size(width = 160.dp, height = 160.dp),
                    ) {
                        Card(
                            modifier = Modifier
                                .size(width = 130.dp, height = 130.dp)
                                .align(alignment = Alignment.Center),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFFA1A1A1)
                            ),
                            shape = CircleShape
                        ) {
                            Icon(
                                imageVector = Icons.Default.AccountCircle,
                                contentDescription = "",
                            )
                        }
                        Card(
                            modifier = Modifier
                                .size(width = 50.dp, height = 50.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFF0B32A5)
                            ),
                            shape = CircleShape
                        ) {
                            Box(
                                modifier = Modifier
                                .fillMaxSize(),
                                contentAlignment = Alignment.Center){
                                Icon(
                                    imageVector = Icons.Default.CameraAlt,
                                    contentDescription = "",
//                                modifier = Modifier.align(alignment = Alignment.Center),
                                    tint = Color.White
                                )
                            }
                        }
                    }
                    Card(
                        modifier = Modifier
                            .size(width = 32.dp, height = 32.dp),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(containerColor = Color(0xFF000000))
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.QuestionMark,
                                contentDescription = "",
                                tint = Color.White
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(24.dp))
                OutlinedTextField(
                    value = nomeContatoState.value,
                    onValueChange = {
                        nomeContatoState.value = it
                    },
                    keyboardOptions = KeyboardOptions(
                        capitalization = KeyboardCapitalization.Words,
                        keyboardType = KeyboardType.Text
                    ),
                    modifier = Modifier
                        .padding(horizontal = 32.dp)
                        .fillMaxWidth(),
                    label = {
                        Text(text = stringResource(id = R.string.contact_name))
                    }
                )
                OutlinedTextField(
                    value = telefoneContatoState.value,
                    onValueChange = {
                        telefoneContatoState.value = it
                    },
                    keyboardOptions = KeyboardOptions(
                        capitalization = KeyboardCapitalization.Characters,
                        keyboardType = KeyboardType.Phone
                    ),
                    modifier = Modifier
                        .padding(horizontal = 32.dp)
                        .fillMaxWidth(),
                    label = {
                        Text(text = stringResource(id = R.string.contact_phone))
                    }
                )
                OutlinedTextField(
                    value = emailContatoState.value,
                    onValueChange = {
                        emailContatoState.value = it
                    },
                    keyboardOptions = KeyboardOptions(
                        capitalization = KeyboardCapitalization.Words,
                        keyboardType = KeyboardType.Email
                    ),
                    modifier = Modifier
                        .padding(horizontal = 32.dp)
                        .fillMaxWidth(),
                    label = {
                        Text(text = stringResource(id = R.string.contact_email))
                    }
                )
                OutlinedTextField(
                    value = dataNascimentoContatoState.value,
                    onValueChange = {
                        dataNascimentoContatoState.value = it
                    },
                    keyboardOptions = KeyboardOptions(
                        capitalization = KeyboardCapitalization.Characters,
                        keyboardType = KeyboardType.Text
                    ),
                    modifier = Modifier
                        .padding(horizontal = 32.dp)
                        .fillMaxWidth(),
                    label = {
                        Text(text = stringResource(id = R.string.contact_birth_date))
                    }
                )
                Row (
                    modifier = Modifier
                        .padding(horizontal = 32.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Checkbox(
                        checked = isAmigoContatoState.value,
                        onCheckedChange = {
                            isAmigoContatoState.value = it
                        }
                    )
                    Text(text = stringResource(id = R.string.friend))
                }
                Spacer(modifier = Modifier.height(32.dp))
                Button(
                    modifier = Modifier
                        .padding(horizontal = 32.dp)
                        .fillMaxWidth(),
                    onClick = {
                        val contato = Contato(
                            nome = nomeContatoState.value,
                            telefone = telefoneContatoState.value,
                            email = emailContatoState.value,
                            dataNascimento = dataNascimentoContatoState.value,
                            isAmigo = isAmigoContatoState.value
                        )
                        cr.salvar(contato)
                    }
                ) {
                    Text(text = stringResource(id = R.string.save_contact))
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewTelaCadastro() {
    TelaCadastro()
}