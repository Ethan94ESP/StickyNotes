package com.ethan.stickynotes.domain.use_case

import com.ethan.stickynotes.domain.model.Note
import com.ethan.stickynotes.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}