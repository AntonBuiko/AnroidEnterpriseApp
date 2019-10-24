package com.example.proga2_laba.View.UI;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.proga2_laba.R;
import com.example.proga2_laba.databinding.FragmentRoleSelectionBinding;
import com.example.proga2_laba.viewmodel.MainViewModel;
import com.example.proga2_laba.viewmodel.RoleViewModel;

public class RoleSelection extends Fragment {

    private RoleViewModel roleViewModel;
    private int page;

    public static RoleSelection newInstance(int page) {
        RoleSelection roleSelection = new RoleSelection();
        Bundle args = new Bundle();
        args.putInt("page", page);
        roleSelection.setArguments(args);
        return roleSelection;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("page");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentRoleSelectionBinding fragmentRoleSelectionBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_role_selection,
                container,
                false
        );
        fragmentRoleSelectionBinding.setLifecycleOwner(getActivity());
        fragmentRoleSelectionBinding.setRoleViewModel(roleViewModel);
        fragmentRoleSelectionBinding.executePendingBindings();
        return fragmentRoleSelectionBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        roleViewModel = ViewModelProviders.of(getActivity()).get(MainViewModel.class).getRoleViewModel();
    }
}
