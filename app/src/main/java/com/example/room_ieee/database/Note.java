package com.example.room_ieee.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Note {

    @PrimaryKey(autoGenerate = true)
   public int id ;

   public String title;
   public  String description;
   public String date ;

    public Note() {
    }

    @Ignore
    public Note(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }


}
