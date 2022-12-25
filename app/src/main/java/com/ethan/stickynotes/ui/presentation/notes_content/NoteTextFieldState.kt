package com.ethan.stickynotes.ui.presentation.notes_content


data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
