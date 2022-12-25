package com.ethan.stickynotes.domain.use_case

import com.ethan.stickynotes.domain.model.Note
import com.ethan.stickynotes.domain.repository.NoteRepository


class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}