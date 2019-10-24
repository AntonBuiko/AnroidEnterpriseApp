package com.example.proga2_laba.Service.helpers;

import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proga2_laba.R;
import com.example.proga2_laba.View.Adapter.OrganizationRecycleViewAdapter;
import com.example.proga2_laba.model.Organization;

import java.util.ArrayList;
import java.util.List;

public class CustomViewBinding {
    @BindingAdapter({"adapter", "data"})
    public static void bindRecyclerViewAdapter(RecyclerView recyclerView, OrganizationRecycleViewAdapter adapter, List<Organization> list) {
        if (list != null) {
            adapter.setData(list);
        }
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(adapter);
    }

    @BindingAdapter({"data"})
    public static void bindSninner(Spinner spinner, List<Organization> organizations) {
        List<String> list = new ArrayList<>();
        if (organizations != null){
            for (Organization organization : organizations) {
                list.add(organization.name);
            }
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                        spinner.getContext(),
                        R.layout.support_simple_spinner_dropdown_item,
                        list);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner.setAdapter(adapter);
        }
    }
}
