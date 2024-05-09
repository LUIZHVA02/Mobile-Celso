package br.senai.sp.jandira.cadastrarcontatosaa.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.senai.sp.jandira.cadastrarcontatosaa.model.Contato

@Dao
interface ContatoDAO {
    @Insert
    fun salvar(contato: Contato):Long

    @Update
    fun atualizar(contato: Contato):Int

    @Delete
    fun excluir(contato: Contato):Int

    @Query("select *from tbl_contatos order by nome;")
    fun listarTodosOsContatos():List<Contato>

//    @Query("select *from tbl_contatos where id = :id;")
//    fun buscarContatosPorId(id: Long):Contato
//
//    @Query("select *from tbl_contatos where nome like :nome order by nome;")
//    fun buscarContatosPeloNome(nome: String):Contato
//
//    @Query("select *from tbl_contatos where is_amigo is true;")
//    fun buscarContatosPorAmigos(isAmigo: Boolean):Contato

}