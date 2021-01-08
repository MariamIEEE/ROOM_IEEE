package com.example.room_ieee;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.example.room_ieee.database.Note;
import com.example.room_ieee.database.NoteDataBase;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected Toolbar toolbar;
    protected FloatingActionButton fab;
    protected RecyclerView noteRecycle;
    List<Note> allNotes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //get all notes from database
        //get date formate
        //delete note
        //edite note

        //how to not useing singlton pattern and the time create one databouse through the app
        // defferentiate between vector Assets and imageAssets
        //

        initView();
       allNotes = NoteDataBase.getInstance(this).noteDao().getAllNotes();

        //item Recycler design + adapter
      // initRecycler();

        //save new Note
        NoteDataBase.getInstance(this).noteDao().addNote(new Note("mariam","mariam","20"));


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.note_recycle) {

        }
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        noteRecycle = (RecyclerView) findViewById(R.id.note_recycle);
        noteRecycle.setOnClickListener(MainActivity.this);
    }



}