package com.example.mynotesapp;

import com.example.mynotesapp.entitiy.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();
    void postExecute(ArrayList<Note> notes);
}
