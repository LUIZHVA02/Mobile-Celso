package br.senai.sp.jandira.mytrips.repository

import android.content.Context
import br.senai.sp.jandira.mytrips.dao.MyTripsDb
import br.senai.sp.jandira.mytrips.model.Usuario

class UsuarioRepository (context: Context){
    private val db = MyTripsDb.getBancoDeDados(context).usuariosDao()

    fun salvar (usuario: Usuario):Long{
        return db.salvar(usuario)
    }
    fun atualizar (usuario: Usuario):Int{
        return db.atualizar(usuario)
    }
    fun excluir (usuario: Usuario):Int{
        return db.excluir(usuario)
    }

    fun listarTodosOsContatos():List<Usuario>{
        return db.listarTodosOsUsuarios()
    }

    fun validarLoginEmailSenha(usuario: Usuario): Usuario {
        return  db.buscarUsuarioPeloEmailSenha(email = usuario.email, senha = usuario.senha)
    }

    fun validarLoginNomeSenha(usuario: Usuario): Usuario {
        return  db.buscarUsuarioPeloNomelSenha(nome = usuario.nome, senha = usuario.senha)
    }
}