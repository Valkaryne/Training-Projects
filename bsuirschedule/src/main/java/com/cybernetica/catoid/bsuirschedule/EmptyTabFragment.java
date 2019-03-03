package com.cybernetica.catoid.bsuirschedule;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class EmptyTabFragment extends TabFragment {
    private static final int LAYOUT = R.layout.fragment_empty_tab;
    private String title;
    private Context context;
    private View view;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static EmptyTabFragment newInstance(Context context, String title) {
        Bundle args = new Bundle();
        EmptyTabFragment fragment = new EmptyTabFragment();
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

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        view = getView();
        if (view != null) {
            TextView noLessonsTv = view.findViewById(R.id.noLessonsTv);
            if (title.equals(context.getString(R.string.title_today)))
                noLessonsTv.setText(context.getString(R.string.no_lessons_today));
            else if (title.equals(context.getString(R.string.title_tomorrow)))
                noLessonsTv.setText(context.getString(R.string.no_lessons_tomorrow));
            else
                noLessonsTv.setText(context.getString(R.string.no_lessons_week));
        }
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
