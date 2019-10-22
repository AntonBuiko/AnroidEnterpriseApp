package com.example.proga2_laba.View.UI;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.proga2_laba.R;
import com.example.proga2_laba.databinding.OrganizationFragmentBinding;
import com.example.proga2_laba.viewmodel.PersonViewModel;

public class OrganizationInfo extends Fragment {

    private PersonViewModel personViewModel;
    private int page;

    public static OrganizationInfo newInstance(int page) {
        OrganizationInfo organizationInfo = new OrganizationInfo();
        Bundle args = new Bundle();
        args.putInt("page", page);
        organizationInfo.setArguments(args);
        return organizationInfo;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        personViewModel = ViewModelProviders.of(getActivity()).get(PersonViewModel.class);
        page = getArguments().getInt("page");
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        OrganizationFragmentBinding organizationFragmentBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.organization_fragment,
                container,
                false
        );
        organizationFragmentBinding.setLifecycleOwner(getActivity());
        organizationFragmentBinding.setPersonViewModel(personViewModel);
        organizationFragmentBinding.executePendingBindings();
        return organizationFragmentBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
