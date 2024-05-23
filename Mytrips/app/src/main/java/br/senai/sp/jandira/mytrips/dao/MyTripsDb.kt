package br.senai.sp.jandira.mytrips.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.mytrips.model.Usuario
import br.senai.sp.jandira.mytrips.model.Viagem

@Database(entities = [Usuario :: class, Viagem :: class], version = 1)
abstract class MyTripsDb : RoomDatabase(){


    abstract fun usuariosDao(): UsuariosDAO
    abstract fun viagensDao():ViagensDAO

    companion object{
        private lateinit var instancia: MyTripsDb

        fun getBancoDeDados(context: Context): MyTripsDb{
            instancia = Room
                .databaseBuilder(
                    context,
                    MyTripsDb::class.java,
                    "db_my_trips"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return instancia
        }

    }

}