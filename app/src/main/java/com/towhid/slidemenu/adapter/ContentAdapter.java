package com.towhid.slidemenu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.towhid.slidemenu.ui.TabOneFragment;
import com.towhid.slidemenu.ui.TabTwoFragment;


public class ContentAdapter extends FragmentPagerAdapter {

    private String[] menuNames = new String[]{
            "One", "Two"
    };

    public ContentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return TabOneFragment.newInstance();
        } else {
            return TabTwoFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return menuNames.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return menuNames[position];
    }
}
