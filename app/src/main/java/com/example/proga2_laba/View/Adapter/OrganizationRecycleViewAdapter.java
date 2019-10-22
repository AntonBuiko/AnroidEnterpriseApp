package com.example.proga2_laba.View.Adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proga2_laba.R;
import com.example.proga2_laba.databinding.OrgListItemBinding;
import com.example.proga2_laba.model.Organization;

import java.util.ArrayList;
import java.util.List;

public class OrganizationRecycleViewAdapter extends RecyclerView.Adapter<OrganizationRecycleViewAdapter.OrganizationViewHolder> {

    private List<Organization> items;

    public void setData(List<Organization> data) {
        items = data;
        notifyDataSetChanged();
    }

    public OrganizationRecycleViewAdapter(){
        items = new ArrayList<>();
    }

    @NonNull
    @Override
    public OrganizationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        OrgListItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.org_list_item, parent, false);
        return new OrganizationViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull OrganizationViewHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items != null ? items.size() : 0;
    }

    public static class OrganizationViewHolder extends RecyclerView.ViewHolder {
        private OrgListItemBinding binding;

        public OrganizationViewHolder(@NonNull OrgListItemBinding orgListItemBinding){
            super(orgListItemBinding.getRoot());
            this.binding = orgListItemBinding;
        }

        public void bind(Organization organization) {
            binding.setOrganization(organization);
            binding.executePendingBindings();
        }
    }
}
