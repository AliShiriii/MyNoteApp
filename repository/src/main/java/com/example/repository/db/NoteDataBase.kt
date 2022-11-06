package com.example.repository.db

import androidx.room.Database
import com.example.repository.dao.NoteDao
import com.example.repository.entitis.Note

@Database(entities = [Note::class], version = 1, exportSchema = false )
abstract class NoteDataBase {

    abstract fun getNotes(): NoteDao
}