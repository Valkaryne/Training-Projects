package com.cybernetica.catoid.bsuirschedule;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cybernetica.catoid.bsuirschedule.RequestModels.ScheduleModel;

import java.util.List;

public class TabFragment extends Fragment {
    private static final int LAYOUT = R.layout.fragment_tab;
    private String title;
    private Context context;
    private View view;

    private RecyclerView mScheduleRecycler;

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
        Log.d("CAT", "TabFragment, onCreateView");
        mScheduleRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_tab, container, false);

        TempGenerator generator = new TempGenerator();
        List<ScheduleModel> dailySchedule = generator.getTomorrowSchedules();

        if (mScheduleRecycler != null) {
            DailyGroupLessonsAdapter adapter = new DailyGroupLessonsAdapter(dailySchedule, context);
            mScheduleRecycler.setAdapter(adapter);
            LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
            mScheduleRecycler.setLayoutManager(layoutManager);
        } else {
            Log.d("CAT", "Null adapter");
        }

        return mScheduleRecycler;
        //return inflater.inflate(LAYOUT, container, false);
    }

    public void setDailyScheduleAdapter(List<ScheduleModel> dailySchedule, int type) {
        if (mScheduleRecycler != null) {
            DailyGroupLessonsAdapter adapter = new DailyGroupLessonsAdapter(dailySchedule, context);
            mScheduleRecycler.setAdapter(adapter);
            LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
            mScheduleRecycler.setLayoutManager(layoutManager);
        } else {
            Log.d("CAT", "Null adapter");
        }
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
