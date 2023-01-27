package com.erdi.annoteappcompose.domain.use_case

import com.erdi.annoteappcompose.domain.model.Note
import com.erdi.annoteappcompose.domain.repository.NoteRepository
import java.util.*

class GetNoteByDate(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(date: Calendar): Note {
        return repository.getNoteByDate(date)
    }
}