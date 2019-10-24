package com.example.proga2_laba.viewmodel;

import android.app.Application;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.proga2_laba.Repository.AppRepository;
import com.example.proga2_laba.model.Person;

public class PersonViewModel extends AndroidViewModel {
    private ArrayAdapter<String> arrayAdapter;
    private AppRepository appRepository;
    private MutableLiveData<Person> personLiveData;

    public PersonViewModel(@NonNull Application application){
        super(application);
        personLiveData = new MutableLiveData<>();
        appRepository = new AppRepository(application);
//        List<Organization> list = appRepository.loadOrganizations();
//        for (Organization o : list)  appRepository.deleteOrg(o);
//        Organization org = new Organization();
//        org.rating = 9;
//        org.name = "БарГУ";
//        appRepository.insertOrg(org);
//        org = new Organization();
//        org.rating = 6;
//        org.name = "БГТУ";
//        appRepository.insertOrg(org);
//        org = new Organization();
//        org.rating = 3;
//        org.name = "БНТУ";
//        appRepository.insertOrg(org);
    }

    public MutableLiveData<Person> getPerson(){
        return personLiveData;
    }
 }
