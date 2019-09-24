package com.towhid.slidemenu.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.towhid.slidemenu.R;


public class TabOneFragment extends Fragment {

    public static TabOneFragment newInstance() {
        Bundle args = new Bundle();
        TabOneFragment fragment = new TabOneFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frg_tab_one, container, false);
        return rootView;
    }
}
