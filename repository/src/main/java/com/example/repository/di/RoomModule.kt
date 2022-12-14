package com.example.repository.di

import android.content.Context
import androidx.room.Room
import com.example.repository.dao.NoteDao
import com.example.repository.db.NoteDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RoomModule {

//    @Provides
//    @Singleton
//    fun provideDataBase(@ApplicationContext context: Context): NoteDataBase =
//
//         Room.databaseBuilder(context, NoteDataBase::class.java, "database_notes")
//            .fallbackToDestructiveMigration()
//            .build()
//
//    @Provides
//    @Singleton
//    fun provideDao(dataBase: NoteDataBase): NoteDao = dataBase.getNotes()

}