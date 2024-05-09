package br.senai.sp.jandira.listadeviagem.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.listadeviagem.R
import br.senai.sp.jandira.listadeviagem.model.Viagem
import java.time.LocalDate

class ViagemRepository {
    @Composable
    fun listarTodaAsViagens():List<Viagem>{
        val londres = Viagem(
            id = 1,
            destino = "Londres",
            descricao = "Londres, capital da Inglaterra e do Reino Unido, é uma cidade do século 21 com uma história que remonta à era romana.",
            dataChegada = LocalDate.of(2019,2,18),
            dataPartida = LocalDate.of(2019,2,21),
            imagem = painterResource(id = R.drawable.foto_londres)
        )
        val paris = Viagem(
            id = 2,
            destino = "Paris",
            descricao = "Paris, a capital da França, é uma importante cidade europeia e um centro mundial de arte, moda, gastronomia e cultura.",
            dataChegada = LocalDate.of(2018,12,18),
            dataPartida = LocalDate.of(2018,12,26)
        )
        val porto = Viagem(
            id = 3,
            destino = "Porto",
            descricao = "Porto é uma cidade costeira no noroeste de Portugal conhecida pelas pontes imponentes e pela produção de vinho do Porto.",
            dataChegada = LocalDate.of(2016,10,5),
            dataPartida = LocalDate.of(2019,10,17)
        )
        val curitiba = Viagem(
            id = 4,
            destino = "Curitiba",
            descricao = "Curitiba é a capital do estado do Paraná, na região sul do Brasil.",
            dataChegada = LocalDate.of(2019,4,1),
            dataPartida = LocalDate.of(2019,4,15)
        )
        val xangai = Viagem(
            id = 5,
            destino = "Xangai",
            descricao = "Xangai, na costa central da China, é a maior cidade do país e um núcleo financeiro global.",
            dataChegada = LocalDate.of(2024,2,7),
            dataPartida = LocalDate.of(2024,2,14)
        )

        return listOf(londres, paris, porto, curitiba, xangai)
    }

}