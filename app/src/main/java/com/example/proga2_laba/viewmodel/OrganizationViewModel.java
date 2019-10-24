package com.example.proga2_laba.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.proga2_laba.Repository.AppRepository;
import com.example.proga2_laba.View.Adapter.OrganizationRecycleViewAdapter;
import com.example.proga2_laba.model.Organization;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganizationViewModel extends AndroidViewModel {

    private Integer selectionIndex = 0;
    private OrganizationRecycleViewAdapter recycleViewAdapter;
    private Map<String, Organization> mapNameToOrg;
    private List<Organization> organizationList;
    private Organization organization;
    private AppRepository appRepository;

    public OrganizationViewModel(@NonNull Application application){
        super(application);
        appRepository = new AppRepository(application);
        organizationList = appRepository.loadOrganizations();
        mapNameToOrg = getMapNameToOrg(organizationList);
        organization = new Organization();
    }

    public List<Organization> getOrganizationList(){
        organizationList = appRepository.loadOrganizations();
        mapNameToOrg = getMapNameToOrg(organizationList);
        return organizationList;
    }

    public OrganizationRecycleViewAdapter getRecycleViewAdapter() {
        return recycleViewAdapter != null ? recycleViewAdapter : (recycleViewAdapter = new OrganizationRecycleViewAdapter());
    }

    private HashMap<String, Organization> getMapNameToOrg(List<Organization> list){
        HashMap<String, Organization> map = new HashMap<>();
        for (Organization org : list){
            map.put(org.name, org);
        }
        return map;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public void setSelectedOrg(int i){
        setOrganization(organizationList.get(i));
    }

    public Integer getSelectionIndex() {
        return selectionIndex;
    }

    public void setSelectionIndex(Integer selectionIndex) {
        this.selectionIndex = selectionIndex;
        organization = organizationList.get(selectionIndex);
    }
}
