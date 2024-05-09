package br.senai.sp.jandira.mytrips.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.senai.sp.jandira.mytrips.model.Usuario

@Dao
interface UsuariosDAO {
    @Insert
    fun salvar(usuario: Usuario):Long

    @Update
    fun atualizar(usuario: Usuario):Int

    @Delete
    fun excluir(usuario: Usuario):Int

    @Query("select *from tbl_usuarios order by nome;")
    fun listarTodosOsContatos():List<Usuario>

//    @Query("select *from tbl_contatos where id = :id;")
//    fun buscarContatosPorId(id: Long):Contato
//
//    @Query("select *from tbl_contatos where nome like :nome order by nome;")
//    fun buscarContatosPeloNome(nome: String):Contato
//
//    @Query("select *from tbl_contatos where is_amigo is true;")
//    fun buscarContatosPorAmigos(isAmigo: Boolean):Contato
}