package com.mtdagar.notesapp.feature_note.presentation.util

sealed class Screen (val route: String) {
    object NotesScreen: Screen("notes_scree")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}