package com.example.mynoteapp.viewModel

import com.example.mynoteapp.repository.NoteRepository
import com.example.repository.entitis.Note
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(private val repository: NoteRepository){

    suspend fun insertNote(note: Note) = repository.insertNote(note)
    suspend fun updateNote(note: Note) = repository.updateNote(note)
    suspend fun deleteNote(note: Note) = repository.deleteNote(note)
    fun getAllNotes() = repository.getAllNotes()
    fun searchNotes(note: String?) = repository.searchNotes(note)

}