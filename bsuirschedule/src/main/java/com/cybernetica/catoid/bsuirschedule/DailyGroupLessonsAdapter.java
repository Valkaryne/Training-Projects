package com.cybernetica.catoid.bsuirschedule;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cybernetica.catoid.bsuirschedule.RequestModels.Employee;
import com.cybernetica.catoid.bsuirschedule.RequestModels.ScheduleModel;

import java.util.List;

public class DailyGroupLessonsAdapter extends RecyclerView.Adapter<DailyGroupLessonsAdapter.ViewHolder> {

    private List<ScheduleModel> dailySchedule;
    Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        public ViewHolder(CardView view) {
            super(view);
            cardView = view;
        }
    }

    public DailyGroupLessonsAdapter(List<ScheduleModel> dailySchedule, Context context) {
        this.dailySchedule = dailySchedule;
        this.context = context;
    }

    @Override
    public DailyGroupLessonsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_lesson, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        CardView cardView = holder.cardView;
        TextView lessonType = cardView.findViewById(R.id.card_lessonType);
        TextView subject = cardView.findViewById(R.id.card_subject);
        TextView interactor = cardView.findViewById(R.id.card_interactor);
        TextView auditory = cardView.findViewById(R.id.card_auditory);
        TextView startLesson = cardView.findViewById(R.id.card_startLesson);
        TextView endLesson = cardView.findViewById(R.id.card_endLesson);

        String type = dailySchedule.get(position).getLessonType();
        lessonType.setText(type);
        if (type.equals(context.getString(R.string.lecture_type)))
            lessonType.setBackground(context.getDrawable(R.drawable.lesson_bg_lecture));
        else if (type.equals(context.getString(R.string.practice_type)))
            lessonType.setBackground(context.getDrawable(R.drawable.lesson_bg_practice));
        else
            lessonType.setBackground(context.getDrawable(R.drawable.lesson_bg_lab));

        subject.setText(dailySchedule.get(position).getSubject());
        Log.d("CAT", dailySchedule.get(position).getSubject());

        List<Employee> employees = dailySchedule.get(position).getEmployee();
        if (employees != null) {
            interactor.setText(employees.get(0).getFio());
            if (employees.size() > 1) {
                for (int i = 1; i < employees.size(); i++)
                    interactor.append(", " + employees.get(i).getFio());
            }
        }

        List<String> auditories = dailySchedule.get(position).getAuditory();
        if (auditories != null) {
            auditory.setText(auditories.get(0));
            if (auditories.size() > 1) {
                for (int i = 1; i < auditories.size(); i++)
                    auditory.append(", " + auditories.get(i));
            }
        }

        startLesson.setText(dailySchedule.get(position).getStartLessonTime());
        endLesson.setText(dailySchedule.get(position).getEndLessonTime());
    }

    @Override
    public int getItemCount() {
        return dailySchedule.size();
    }
}
