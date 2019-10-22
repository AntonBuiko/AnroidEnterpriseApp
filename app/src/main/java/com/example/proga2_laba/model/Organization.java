package com.example.proga2_laba.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Organization {
    @PrimaryKey(autoGenerate = true)
    public long id;
    @NonNull
    public String name;

    public Integer rating;
}
