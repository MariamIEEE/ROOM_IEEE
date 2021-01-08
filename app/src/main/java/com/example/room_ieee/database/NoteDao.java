package com.example.room_ieee.database;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NoteDao {

    @Insert
    public void addNote(Note note);

    @Delete
    public  void deleteNot(Note note);
     @Query("SELECT * FROM note")
    public List<Note> getAllNotes();


    @Query("delete from note where id=:id")
    public void deleteNoteById(int id);




}
