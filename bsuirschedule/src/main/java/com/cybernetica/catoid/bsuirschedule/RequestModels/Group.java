package com.cybernetica.catoid.bsuirschedule.RequestModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Group {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("facultyId")
    @Expose
    private Integer facultyId;
    @SerializedName("specialityDepartmentEducationFormId")
    @Expose
    private Integer specialityDepartmentEducationFormId;
    @SerializedName("course")
    @Expose
    private Integer course;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("calendarId")
    @Expose
    private String calendarId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Integer facultyId) {
        this.facultyId = facultyId;
    }

    public Integer getSpecialityDepartmentEducationFormId() {
        return specialityDepartmentEducationFormId;
    }

    public void setSpecialityDepartmentEducationFormId(Integer specialityDepartmentEducationFormId) {
        this.specialityDepartmentEducationFormId = specialityDepartmentEducationFormId;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    @Override
    public String toString() {
        return name + " (" + facultyId + ", " + specialityDepartmentEducationFormId + "), Курс: " + course;
    }
}
