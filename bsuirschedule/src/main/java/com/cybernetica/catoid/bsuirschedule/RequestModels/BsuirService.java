package com.cybernetica.catoid.bsuirschedule.RequestModels;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BsuirService {

    // GET /faculties
    @GET("faculties/")
    Call<List<Faculty>> getFaculties();

    // GET /specialities
    @GET("specialities/")
    Call<List<Speciality>> getSpecialities();

    // GET /department
    @GET("department/")
    Call<List<Department>> getDepartments();

    // GET /employees
    @GET("employees/")
    Call<List<Employee>> getEmployees();

    // GET /groups
    @GET("groups/")
    Call<List<Group>> getGroups();

    // GET /portal/employeeSchedule
    @GET("portal/employeeSchedule")
    Call<EmployeeSchedule> getEmployeeSchedule(
            @Query("employeeId") String id
    );

    // GET /studentGroup/schedule
    @GET("studentGroup/schedule")
    Call<GroupSchedule> getGroupSchedule(
            @Query("studentGroup") String groupNo
    );

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://journal.bsuir.by/api/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}