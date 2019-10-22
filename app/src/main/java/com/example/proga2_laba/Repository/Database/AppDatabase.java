package com.example.proga2_laba.Repository.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.proga2_laba.model.Organization;
import com.example.proga2_laba.model.Person;
import com.example.proga2_laba.Repository.Dao.OrganizationDao;
import com.example.proga2_laba.Repository.Dao.PersonDao;

@Database(entities = {Person.class, Organization.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract PersonDao personDao();
    public abstract OrganizationDao organizationDao();

    private static volatile AppDatabase INSTANCE;

    public static AppDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "AppDatabase.sqlite")
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
