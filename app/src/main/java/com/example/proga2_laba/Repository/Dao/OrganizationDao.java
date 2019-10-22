package com.example.proga2_laba.Repository.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.proga2_laba.model.Organization;

import java.util.List;

@Dao
public interface OrganizationDao {
    @Query("SELECT * FROM Organization")
    List<Organization> getAll();

    @Query("SELECT * FROM Organization WHERE id = :id")
    LiveData<Organization> getById(long id);

    @Insert
    void insert(Organization person);

    @Update
    void update(Organization person);

    @Delete
    void delete(Organization person);
}
