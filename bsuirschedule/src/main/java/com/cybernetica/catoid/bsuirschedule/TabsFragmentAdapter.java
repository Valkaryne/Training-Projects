package com.cybernetica.catoid.bsuirschedule;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, TabFragment> tabs;
    private Context context;
    // data

    public TabsFragmentAdapter(Context context, FragmentManager manager) {
        super(manager);
        this.context = context;
        initTabsMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, TabFragment.newInstance(context, "Сегодня"));
        tabs.put(1, TabFragment.newInstance(context, "Завтра"));
        tabs.put(2, TabFragment.newInstance(context, "Неделя 1"));
        tabs.put(3, TabFragment.newInstance(context, "Неделя 2"));
        tabs.put(4, TabFragment.newInstance(context, "Неделя 3"));
        tabs.put(5, TabFragment.newInstance(context, "Неделя 4"));
    }
}
