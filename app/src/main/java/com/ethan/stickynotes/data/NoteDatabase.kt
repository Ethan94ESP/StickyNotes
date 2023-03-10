package com.ethan.stickynotes.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ethan.stickynotes.data.dao.NoteDao
import com.ethan.stickynotes.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}