package com.example.proga2_laba.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.proga2_laba.Repository.AppRepository;
import com.example.proga2_laba.View.Adapter.OrganizationRecycleViewAdapter;
import com.example.proga2_laba.model.Organization;
import com.example.proga2_laba.model.Person;

import java.util.List;

public class PersonViewModel extends AndroidViewModel {
    private OrganizationRecycleViewAdapter recycleViewAdapter;
    private AppRepository appRepository;
    private final MutableLiveData<Person> personLiveData;
    private List<Organization> liveDataOrganization;

    public PersonViewModel(@NonNull Application application){
        super(application);
        personLiveData = new MutableLiveData<>();
        appRepository = new AppRepository(application);
        Organization org = new Organization();
        org.rating = 5;
        org.name = "Test name";
        appRepository.insertOrg(org);
    }

    public MutableLiveData<Person> getPerson(){
        return personLiveData;
    }

    public List<Organization> getLiveDataOrganization(){
        return appRepository.loadOrganizations();
    }

    public OrganizationRecycleViewAdapter getRecycleViewAdapter() {
        return recycleViewAdapter != null ? recycleViewAdapter : new OrganizationRecycleViewAdapter();
    }

    public void setRecycleViewAdapter(OrganizationRecycleViewAdapter recycleViewAdapter) {
        this.recycleViewAdapter = recycleViewAdapter;
    }

}
