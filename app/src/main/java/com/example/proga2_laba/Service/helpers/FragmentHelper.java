package com.example.proga2_laba.Service.helpers;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class FragmentHelper {
    public static FragmentManager getFragmentManager(Context context) {
        return ((AppCompatActivity) context).getSupportFragmentManager();
    }

    public static void openFragment(Context context, int frameId, Fragment fragment) {
        getFragmentManager(context).beginTransaction()
                .replace(frameId, fragment, fragment.getClass().toString())
                .addToBackStack(null).commit();
    }

    public static void addFragment(Context context, int frameId, Fragment fragment) {
        getFragmentManager(context).beginTransaction()
                .add(frameId, fragment, fragment.getClass().toString())
                .addToBackStack(null).commit();
    }
}
