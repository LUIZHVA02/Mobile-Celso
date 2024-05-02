package br.senai.sp.jandira.mytrips.repository

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AcUnit
import androidx.compose.material.icons.rounded.AreaChart
import androidx.compose.material.icons.rounded.BeachAccess
import androidx.compose.material.icons.rounded.DownhillSkiing
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import br.senai.sp.jandira.mytrips.model.Categoria

class CateroriaRepository {
    @Composable
    fun listarCategorias():List<Categoria> {
        val montain = Categoria(
            id = 1,
            nome = "Mountain",
            icon = Icons.Rounded.AreaChart
        )
        val snow = Categoria(
            id = 2,
            nome = "Snow",
            icon = Icons.Rounded.DownhillSkiing
        )
        val beach = Categoria(
            id = 3,
            nome = "Beach",
            icon = Icons.Rounded.BeachAccess
        )
        return listOf(montain, snow, beach)
    }
}