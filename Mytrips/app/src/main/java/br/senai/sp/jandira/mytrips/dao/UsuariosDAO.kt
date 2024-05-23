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
    fun listarTodosOsUsuarios():List<Usuario>

    @Query("select *from tbl_usuarios where id = :id;")
    fun buscarUsuarioPorId(id: Long):Usuario

    @Query("select *from tbl_usuarios where nome like :nome order by nome;")
    fun buscarUsuariosPeloNome(nome: String):Usuario

    @Query("select *from tbl_usuarios where email = :email and senha = :senha;")
    fun buscarUsuarioPeloEmailSenha(email: String, senha: String):Usuario

    @Query("select *from tbl_usuarios where nome = :nome and senha = :senha;")
    fun buscarUsuarioPeloNomeSenha(nome: String, senha: String):Usuario

//    @Query("select *from tbl_usuarios where is_adulto = '1';")
//    fun buscarUsuariosPorAdultos()
}