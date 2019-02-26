package com.cybernetica.catoid.bsuirschedule;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabFragment extends Fragment {
    private static final int LAYOUT = R.layout.fragment_tab;
    private String title;
    private Context context;
    private View view;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static TabFragment newInstance(Context context, String title) {
        Bundle args = new Bundle();
        TabFragment fragment = new TabFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(title);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(LAYOUT, container, false);
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
