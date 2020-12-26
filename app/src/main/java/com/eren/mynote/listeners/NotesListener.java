package com.eren.mynote.listeners;

import com.eren.mynote.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
