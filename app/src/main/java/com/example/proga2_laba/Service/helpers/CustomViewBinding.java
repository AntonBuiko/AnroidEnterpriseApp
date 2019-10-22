package com.example.proga2_laba.Service.helpers;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proga2_laba.View.Adapter.OrganizationRecycleViewAdapter;
import com.example.proga2_laba.model.Organization;

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
}
