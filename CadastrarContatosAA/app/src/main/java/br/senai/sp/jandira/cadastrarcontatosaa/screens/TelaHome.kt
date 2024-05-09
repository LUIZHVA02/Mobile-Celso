package br.senai.sp.jandira.cadastrarcontatosaa.screens

import android.content.ClipData.Item
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import br.senai.sp.jandira.cadastrarcontatosaa.repository.ContatoRepository

@Composable
fun TelaHome() {
    val cr = ContatoRepository(LocalContext.current)

    Column {
        LazyColumn{
            items(cr.listarTodosOsContatos()){
                Card {
                    Text(text = it.nome)
                }
            }
        }
    }
}

