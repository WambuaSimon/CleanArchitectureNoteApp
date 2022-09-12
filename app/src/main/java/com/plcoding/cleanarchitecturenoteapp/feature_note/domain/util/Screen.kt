package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

sealed class Screen(val route: String) {
    object NotesScreen : Screen(route = "notes_screen")
    object AddEditNoteScreen : Screen(route = "add_edit_note_screen")
}
