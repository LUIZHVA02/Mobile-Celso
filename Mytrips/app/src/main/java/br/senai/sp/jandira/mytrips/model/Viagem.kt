package br.senai.sp.jandira.mytrips.model

import android.os.storage.StorageManager.StorageVolumeCallback
import androidx.compose.ui.graphics.painter.Painter
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "tbl_viagens")

data class Viagem(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    var destino: String = "",
    var descricao: String = "",

    @ColumnInfo(name = "data_chegada", defaultValue = "1970-02-01")
    var dataChegada: String = "",

    @ColumnInfo(name = "data_partida", defaultValue = "1970-01-01")
    var dataPartida: String = "",


    var imagem: Painter? = null
)
