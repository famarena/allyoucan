package com.android.itfs.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.android.itfs.myapplication.fragment.InfoFragment;
import com.android.itfs.myapplication.fragment.MappaFragment;
import com.android.itfs.myapplication.fragment.PrenotaFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {


    int numTabs;

    public PagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }



    @Override
    public Fragment getItem(int position) {


        switch (position) {
            case 0:
                InfoFragment info = new InfoFragment();
                return info;
            case 1:
                PrenotaFragment pren = new PrenotaFragment();
                return pren;
            case 2:
                MappaFragment map = new MappaFragment();
                return map;


            default:
                return null;

        }


    }


    @Override
    public int getCount() {
        return numTabs;
    }
}