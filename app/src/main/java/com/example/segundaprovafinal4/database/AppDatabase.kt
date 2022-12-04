package com.example.segundaprovafinal4.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.segundaprovafinal4.dao.CardapioDao
import com.example.segundaprovafinal4.model.Cardapio

@Database(entities = [Cardapio::class], version = 2, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun cardapioDao(): CardapioDao

    companion object{
        @Volatile private var instance:AppDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also{ instance = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "database.db")
                .fallbackToDestructiveMigration()
                .build()

    }
}