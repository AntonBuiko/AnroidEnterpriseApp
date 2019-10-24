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
import com.example.proga2_laba.databinding.ContactDetailsFragmentBinding;
import com.example.proga2_laba.viewmodel.MainViewModel;
import com.example.proga2_laba.viewmodel.PersonViewModel;

public class ContactDetails extends Fragment {

    private PersonViewModel personViewModel;
    private int page;

    public static ContactDetails newInstance(int page) {
        ContactDetails contactDetails = new ContactDetails();
        Bundle args = new Bundle();
        args.putInt("page", page);
        contactDetails.setArguments(args);
        return contactDetails;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("page", 0);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ContactDetailsFragmentBinding contactDetailsFragmentBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.contact_details_fragment,
                container,
                false
        );
        contactDetailsFragmentBinding.setLifecycleOwner(getActivity());
        contactDetailsFragmentBinding.setPersonViewModel(personViewModel);
        contactDetailsFragmentBinding.executePendingBindings();
        return contactDetailsFragmentBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        personViewModel = ViewModelProviders.of(getActivity()).get(MainViewModel.class).getPersonViewModel();
    }

}
