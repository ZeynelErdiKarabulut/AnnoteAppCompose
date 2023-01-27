package com.erdi.annoteappcompose.domain.use_case


import com.erdi.annoteappcompose.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(noteId: Int) {
        repository.deleteNote(noteId)
    }
}