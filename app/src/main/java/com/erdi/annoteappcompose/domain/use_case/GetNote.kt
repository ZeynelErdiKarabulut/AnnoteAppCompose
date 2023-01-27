package com.erdi.annoteappcompose.domain.use_case

import com.erdi.annoteappcompose.domain.model.Note
import com.erdi.annoteappcompose.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note {
        return repository.getNoteById(id)
    }
}