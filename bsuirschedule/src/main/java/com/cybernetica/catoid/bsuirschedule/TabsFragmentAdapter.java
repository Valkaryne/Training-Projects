package com.cybernetica.catoid.bsuirschedule;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, TabFragment> tabs;
    private Context context;
    private final FragmentManager mFragmentManager;
    // data

    public TabsFragmentAdapter(Context context, FragmentManager manager) {
        super(manager);
        this.mFragmentManager = manager;
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
        Log.d("CAT", "initTabsMap");
        tabs = new HashMap<>();
        tabs.put(0, EmptyTabFragment.newInstance(context, context.getString(R.string.title_today)));
        tabs.put(1, EmptyTabFragment.newInstance(context, context.getString(R.string.title_tomorrow)));
        tabs.put(2, EmptyTabFragment.newInstance(context, context.getString(R.string.title_week) + " " + 1));
        tabs.put(3, EmptyTabFragment.newInstance(context, context.getString(R.string.title_week) + " " + 2));
        tabs.put(4, EmptyTabFragment.newInstance(context, context.getString(R.string.title_week) + " " + 3));
        tabs.put(5, EmptyTabFragment.newInstance(context, context.getString(R.string.title_week) + " " + 4));

        tabs.put(1, TabFragment.newInstance(context, context.getString(R.string.title_tomorrow)));

        //tabs.put(3, TabFragment.newInstance(context, context.getString(R.string.title_week) + " " + 2));
    }

    // TEMP
    public void refreshAdapter() {
        TempGenerator generator = new TempGenerator();
        tabs.get(1).setDailyScheduleAdapter(generator.getTomorrowSchedules(), 0);
    }
}
