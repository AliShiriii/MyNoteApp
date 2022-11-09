package com.example.repository.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.repository.entitis.Note

@Dao
interface NoteDao {

    //Insert
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    //Update
    @Update
    suspend fun updateNote(note: Note)

    //Delete
    @Delete
    suspend fun deleteNote(note: Note)

    //Query for get all notes
    @Query("SELECT * FROM notes ORDER BY id DESC")
    fun getAllNotes(): LiveData<List<Note>>

    //Query fore search notes
    @Query("SELECT * FROM notes ORDER BY title LIKE :query OR subTitle LIKE :query")
    fun searchNotes(query: String?): LiveData<List<Note>>
}