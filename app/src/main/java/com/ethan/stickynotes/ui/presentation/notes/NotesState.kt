package com.ethan.stickynotes.ui.presentation.notes

import com.ethan.stickynotes.domain.model.Note
import com.ethan.stickynotes.domain.utils.NoteOrder
import com.ethan.stickynotes.domain.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false)