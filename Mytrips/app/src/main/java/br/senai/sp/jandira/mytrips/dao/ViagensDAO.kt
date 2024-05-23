package br.senai.sp.jandira.mytrips.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.senai.sp.jandira.mytrips.model.Viagem

@Dao
interface ViagensDAO {
    @Insert
    fun salvar(viagem: Viagem):Long

    @Update
    fun atualizar(viagem: Viagem):Int

    @Delete
    fun excluir(viagem: Viagem):Int

    @Query("select *from tbl_viagens order by id;")
    fun listarTodasAsViagens():List<Viagem>

    @Query("select *from tbl_viagens where id = :id;")
    fun buscarViagemPorId(id: Long): Viagem

    @Query("select *from tbl_viagens where destino like :destino order by destino;")
    fun buscarViagensPeloDestino(destino: String): Viagem

    @Query("select *from tbl_viagens where destino = :destino and descricao = :descricao;")
    fun buscarViagemPeloDestinoDescricao(destino: String, descricao: String): Viagem
}