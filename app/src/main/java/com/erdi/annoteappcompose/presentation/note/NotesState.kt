package com.erdi.annoteappcompose.presentation.note


import com.erdi.annoteappcompose.domain.model.Note
import java.util.*

data class NotesState(
    val notes: List<Note> = emptyList(),
    val recentlyVisited : Calendar? = null
)
