package com.cybernetica.catoid.bsuirschedule.RequestModels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Schedule {

    @SerializedName("weekDay")
    @Expose
    private String weekDay;
    @SerializedName("schedule")
    @Expose
    private List<ScheduleModel> schedule = null;

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public List<ScheduleModel> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<ScheduleModel> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return weekDay + "\n\n" + schedule.toString();
    }
}
