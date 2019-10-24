package com.example.proga2_laba.View.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.proga2_laba.View.UI.ContactDetails;
import com.example.proga2_laba.View.UI.OrganizationInfo;
import com.example.proga2_laba.View.UI.RoleSelection;
import com.example.proga2_laba.View.UI.SaveInformation;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 4;
    public MyFragmentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return ContactDetails.newInstance(0);
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return OrganizationInfo.newInstance(1);
            case 2:
                return RoleSelection.newInstance(2);
            case 3:
                return SaveInformation.newInstance(3);
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Fragment fragment = getItem(position);
        return fragment.getClass().getSimpleName();
    }
}
