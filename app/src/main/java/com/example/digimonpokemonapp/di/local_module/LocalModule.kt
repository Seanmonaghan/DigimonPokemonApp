package com.example.digimonpokemonapp.di.local_module

import android.content.Context
import androidx.room.Room
import com.example.digimonpokemonapp.data.local.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    private const val DB_NAME = "app.db"

    @Volatile
    private var instance: AppDatabase? = null

    private fun createDatabase(context: Context): AppDatabase = Room.databaseBuilder(
        context, AppDatabase::class.java, DB_NAME
    ).build()

    @Provides
    @Singleton
    fun providesDatabase(@ApplicationContext context: Context): AppDatabase {
        return instance ?: createDatabase(context).also {
            instance = it
        }
    }
}