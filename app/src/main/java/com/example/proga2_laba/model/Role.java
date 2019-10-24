package com.example.proga2_laba.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Role {
    @PrimaryKey(autoGenerate = true)
    public long id;
    public String roleName;
}
