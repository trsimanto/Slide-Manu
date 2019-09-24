package com.towhid.slidemenu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.towhid.slidemenu.ui.ChatFragment;
import com.towhid.slidemenu.ui.FriendFragment;


public class SlideRightMenuAdapter extends FragmentPagerAdapter {

    private String[] menuNames = new String[]{
            "chat", "friend"
    };

    public SlideRightMenuAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return ChatFragment.newInstance();
        } else {
            return FriendFragment.newInstance();
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
