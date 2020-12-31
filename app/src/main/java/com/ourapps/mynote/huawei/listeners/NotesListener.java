package com.ourapps.mynote.huawei.listeners;

import com.ourapps.mynote.huawei.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
