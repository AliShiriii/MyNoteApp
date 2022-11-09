package com.example.mynoteapp.repository

import com.example.repository.dao.NoteDao
import com.example.repository.entitis.Note
import javax.inject.Inject

class NoteRepository @Inject constructor(private val dao: NoteDao){

    suspend fun insertNote(note: Note) = dao.insertNote(note)
    suspend fun updateNote(note: Note) = dao.updateNote(note)
    suspend fun deleteNote(note: Note) = dao.deleteNote(note)
    fun getAllNotes() = dao.getAllNotes()
    fun searchNotes(note: String?) = dao.searchNotes(note)

}