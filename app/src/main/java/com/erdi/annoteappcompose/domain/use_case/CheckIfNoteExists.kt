package com.erdi.annoteappcompose.domain.use_case


import com.erdi.annoteappcompose.domain.repository.NoteRepository
import java.util.*

class CheckIfNoteExists(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(date: Calendar): Boolean {
        return repository.exists(date)
    }
}