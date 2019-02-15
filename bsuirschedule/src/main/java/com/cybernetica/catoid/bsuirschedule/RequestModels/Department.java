package com.cybernetica.catoid.bsuirschedule.RequestModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Department {

    @SerializedName("idDepartment")
    @Expose
    private Integer idDepartment;
    @SerializedName("abbrev")
    @Expose
    private String abbrev;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("nameAndAbbrev")
    @Expose
    private String nameAndAbbrev;

    public Integer getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAndAbbrev() {
        return nameAndAbbrev;
    }

    public void setNameAndAbbrev(String nameAndAbbrev) {
        this.nameAndAbbrev = nameAndAbbrev;
    }

    @Override
    public String toString() {
        return nameAndAbbrev + ", " + idDepartment;
    }
}