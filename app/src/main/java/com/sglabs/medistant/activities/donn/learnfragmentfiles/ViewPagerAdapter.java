package com.sglabs.medistant.activities.donn.learnfragmentfiles;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.sglabs.medistant.activities.donn.fragments.LearnFragment;


/**
 * Created by rashad on 5/23/16.
 */


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {

        super(fm);

    }


    @Override
    public Fragment getItem(int position) {

        if (position == 0) {

            return new WhatFragment();

        } else if (position == 1) {

            return new WhyFragment();


        } else if (position == 2) {

            return new TypesFragment();


        } else {

            return new LearnFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

}