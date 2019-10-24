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
import com.example.proga2_laba.databinding.SaveInformationFragmentBinding;
import com.example.proga2_laba.viewmodel.MainViewModel;

public class SaveInformation extends Fragment {

    private MainViewModel mViewModel;
    private int page;

    public static SaveInformation newInstance(int page) {
        SaveInformation saveInformation = new SaveInformation();
        Bundle args = new Bundle();
        args.putInt("page", page);
        saveInformation.setArguments(args);
        return saveInformation;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("page");
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        SaveInformationFragmentBinding saveInformationFragmentBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.save_information_fragment,
                container,
                false
        );
        saveInformationFragmentBinding.setLifecycleOwner(getActivity());
        saveInformationFragmentBinding.setMainViewModel(mViewModel);
        saveInformationFragmentBinding.executePendingBindings();
        return saveInformationFragmentBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
    }

}
