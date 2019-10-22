package com.example.proga2_laba.Repository.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.proga2_laba.model.Person;

import java.util.List;

@Dao
public interface PersonDao {
    @Query("SELECT * FROM Person")
    LiveData<List<Person>> getAll();

    @Query("SELECT * FROM Person WHERE id = :id")
    Person getById(long id);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Person person);

    @Update
    void update(Person person);

    @Delete
    void delete(Person person);
}
