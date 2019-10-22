package com.example.proga2_laba.Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.proga2_laba.Repository.Dao.OrganizationDao;
import com.example.proga2_laba.Repository.Dao.PersonDao;
import com.example.proga2_laba.Repository.Database.AppDatabase;
import com.example.proga2_laba.model.Organization;
import com.example.proga2_laba.model.Person;

import java.util.List;

public class AppRepository {
    private PersonDao personDao;
    private OrganizationDao organizationDao;
    private LiveData<List<Person>> allPersons;
    private final AppDatabase db;

    public AppRepository(Application application){
        db = AppDatabase.getDatabase(application);
        personDao = db.personDao();
        organizationDao = db.organizationDao();
        allPersons = personDao.getAll();
    }

    public LiveData<List<Person>> loadPersons(){
        return personDao.getAll();
    }

    public List<Organization> loadOrganizations(){
        return organizationDao.getAll();
    }

    public void insertPerson (Person person) {
        personDao.insert(person);
    }

    public void updatePerson (Person person) {
        personDao.update(person);
    }

    public void deletePerson (Person person) {
        personDao.delete(person);
    }

    public void insertOrg (Organization organization) {
        organizationDao.insert(organization);
    }

    public void updateOrg (Organization organization) {
        organizationDao.update(organization);
    }

    public void deleteOrg (Organization organization) {
        organizationDao.delete(organization);
    }

}
