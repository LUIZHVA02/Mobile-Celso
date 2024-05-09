package br.senai.sp.jandira.cadastrarcontatosaa.repository

import android.content.Context
import br.senai.sp.jandira.cadastrarcontatosaa.dao.ContatoDb
import br.senai.sp.jandira.cadastrarcontatosaa.model.Contato

class ContatoRepository (context:Context){
    private val db = ContatoDb.getBancoDeDados(context).contatoDao()

    fun salvar (contato: Contato):Long{
        return db.salvar(contato)
    }
    fun atualizar (contato: Contato):Int{
        return db.atualizar(contato)
    }
    fun excluir (contato: Contato):Int{
        return db.excluir(contato)
    }

    fun listarTodosOsContatos():List<Contato>{
        return db.listarTodosOsContatos()
    }
}