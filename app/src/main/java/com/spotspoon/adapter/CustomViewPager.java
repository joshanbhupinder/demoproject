package com.spotspoon.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by bhupinder on 20/7/17.
 */
public class CustomViewPager extends FragmentStatePagerAdapter {

    public CustomViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        VideoImageFragment  videoImageFragment=new VideoImageFragment();
        Bundle bundle=new Bundle();
        bundle.putInt("position",position);
        videoImageFragment.setArguments(bundle);
        return videoImageFragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
