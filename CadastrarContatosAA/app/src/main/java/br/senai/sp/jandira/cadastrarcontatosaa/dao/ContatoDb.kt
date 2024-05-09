package br.senai.sp.jandira.cadastrarcontatosaa.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.cadastrarcontatosaa.model.Contato

@Database(entities = [Contato::class], version = 1)
abstract class ContatoDb : RoomDatabase() {

    abstract fun contatoDao(): ContatoDAO

    companion object{
        private lateinit var instancia: ContatoDb

        fun getBancoDeDados(context: Context): ContatoDb{
            instancia = Room
                .databaseBuilder(
                    context,
                    ContatoDb::class.java,
                    "db_contatos"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return instancia
        }

    }

}