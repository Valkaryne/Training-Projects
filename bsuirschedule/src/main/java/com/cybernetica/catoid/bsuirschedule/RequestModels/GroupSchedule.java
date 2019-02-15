package com.cybernetica.catoid.bsuirschedule.RequestModels;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GroupSchedule {

    @SerializedName("studentGroup")
    @Expose
    private Group studentGroup;
    @SerializedName("schedules")
    @Expose
    private List<Schedule> schedules = null;
    @SerializedName("examSchedules")
    @Expose
    private List<Schedule> examSchedules = null;
    @SerializedName("todayDate")
    @Expose
    private String todayDate;
    @SerializedName("todaySchedules")
    @Expose
    private List<ScheduleModel> todaySchedules = null;
    @SerializedName("tomorrowDate")
    @Expose
    private String tomorrowDate;
    @SerializedName("tomorrowSchedules")
    @Expose
    private List<ScheduleModel> tomorrowSchedules = null;
    @SerializedName("currentWeekNumber")
    @Expose
    private Integer currentWeekNumber;

    public Group getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(Group group) {
        this.studentGroup = group;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public List<Schedule> getExamSchedules() {
        return examSchedules;
    }

    public void setExamSchedules(List<Schedule> examSchedules) {
        this.examSchedules = examSchedules;
    }

    public String getTodayDate() {
        return todayDate;
    }

    public void setTodayDate(String todayDate) {
        this.todayDate = todayDate;
    }

    public List<ScheduleModel> getTodaySchedules() {
        return todaySchedules;
    }

    public void setTodaySchedules(List<ScheduleModel> todaySchedules) {
        this.todaySchedules = todaySchedules;
    }

    public String getTomorrowDate() {
        return tomorrowDate;
    }

    public void setTomorrowDate(String tomorrowDate) {
        this.tomorrowDate = tomorrowDate;
    }

    public List<ScheduleModel> getTomorrowSchedules() {
        return tomorrowSchedules;
    }

    public void setTomorrowSchedules(List<ScheduleModel> tomorrowSchedules) {
        this.tomorrowSchedules = tomorrowSchedules;
    }

    public Integer getCurrentWeekNumber() {
        return currentWeekNumber;
    }

    public void setCurrentWeekNumber(Integer currentWeekNumber) {
        this.currentWeekNumber = currentWeekNumber;
    }

    @Override
    public String toString() {
        return studentGroup.toString() + "\n"
                + "Занятия: " + schedules.toString() + "\n"
                + "Сессия: " + examSchedules.toString() + "\n"
                + "Сегодня: " + todayDate + "\n" + todaySchedules.toString() + "\n"
                + "Завтра: " + tomorrowDate + "\n" + tomorrowSchedules.toString() + "\n"
                + "Текущая неделя: " + currentWeekNumber;
    }
}