package com.example.dell.waterquality;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DELL on 28-01-2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new phDataFragment();
            case 1:
                return new orpDataFragment();
            case 2:
                return new conductivityDataFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
