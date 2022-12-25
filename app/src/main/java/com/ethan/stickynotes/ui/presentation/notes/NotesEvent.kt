package com.ethan.stickynotes.ui.presentation.notes

import com.ethan.stickynotes.domain.model.Note
import com.ethan.stickynotes.domain.utils.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}