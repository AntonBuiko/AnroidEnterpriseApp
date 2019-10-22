package com.example.proga2_laba.View.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.proga2_laba.View.UI.ContactDetails;
import com.example.proga2_laba.View.UI.OrganizationInfo;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 2;
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
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}
