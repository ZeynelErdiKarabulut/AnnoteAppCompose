package com.erdi.annoteappcompose.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.erdi.annoteappcompose.domain.model.Note


@TypeConverters(Converters::class)
@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {
    abstract val dao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}