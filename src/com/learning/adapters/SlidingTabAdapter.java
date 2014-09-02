package com.learning.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.learning.fragments.Friends;
import com.learning.fragments.Home;

public class SlidingTabAdapter extends FragmentPagerAdapter {

    public SlidingTabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new Home();
            case 1:
                return new Friends();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}