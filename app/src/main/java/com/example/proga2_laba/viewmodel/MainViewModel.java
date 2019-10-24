package com.example.proga2_laba.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {
    PersonViewModel personViewModel;
    OrganizationViewModel organizationViewModel;
    RoleViewModel roleViewModel;

    public MainViewModel(Application app){
        super(app);
        personViewModel = new PersonViewModel(app);
        organizationViewModel = new OrganizationViewModel(app);
        roleViewModel = new RoleViewModel(app);
    }

    public OrganizationViewModel getOrganizationViewModel() {
        return organizationViewModel;
    }

    public PersonViewModel getPersonViewModel() {
        return personViewModel;
    }

    public RoleViewModel getRoleViewModel() {
        return roleViewModel;
    }
}
