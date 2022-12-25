package com.ethan.stickynotes.domain.use_case

import com.ethan.stickynotes.domain.model.InvalidNoteException
import com.ethan.stickynotes.domain.model.Note
import com.ethan.stickynotes.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}