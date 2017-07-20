package com.spotspoon.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.spotspoon.fragment.VideoListFragment;


/**
 * Created by bhupinder on 20/7/17.
 */

public class CustomViewPagerWithTabs extends FragmentStatePagerAdapter {

    public CustomViewPagerWithTabs(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new VideoListFragment();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "VIDEOS";

            case 1:
                return "IMAGES";

            case 2:
                return "MILESTONE";

        }
        return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
