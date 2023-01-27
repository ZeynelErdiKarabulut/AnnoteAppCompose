package com.erdi.annoteappcompose.domain.use_case

import com.erdi.annoteappcompose.domain.model.Note
import com.erdi.annoteappcompose.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class GetNotes(
    private val repository: NoteRepository
) {
    operator fun invoke(): Flow<List<Note>> {
        return repository.getAllNotes()
    }
}