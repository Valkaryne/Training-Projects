package com.cybernetica.catoid.bsuirschedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.cybernetica.catoid.bsuirschedule.RequestModels.BsuirService;
import com.cybernetica.catoid.bsuirschedule.RequestModels.Department;
import com.cybernetica.catoid.bsuirschedule.RequestModels.Employee;
import com.cybernetica.catoid.bsuirschedule.RequestModels.EmployeeSchedule;
import com.cybernetica.catoid.bsuirschedule.RequestModels.Faculty;
import com.cybernetica.catoid.bsuirschedule.RequestModels.Group;
import com.cybernetica.catoid.bsuirschedule.RequestModels.GroupSchedule;
import com.cybernetica.catoid.bsuirschedule.RequestModels.Speciality;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private final String FAC_TAG = "Faculties";
    private final String SPEC_TAG = "Specialities";
    private final String DEP_TAG = "Departments";
    private final String EMP_TAG = "Employees";
    private final String GR_TAG = "Groups";
    private final String SCEMP_TAG = "Employee Schedule";
    private final String SCGR_TAG = "Group Schedule";

    BsuirService mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button facButton = findViewById(R.id.facButton);
        facButton.setOnClickListener(view -> getFacultiesRequest());

        Button specButton = findViewById(R.id.specButton);
        specButton.setOnClickListener(view -> getSpecialitiesRequest());

        Button depButton = findViewById(R.id.depButton);
        depButton.setOnClickListener(view -> getDepartmentsRequest());

        Button empButton = findViewById(R.id.empButton);
        empButton.setOnClickListener(view -> getEmployeesRequest());

        Button grButton = findViewById(R.id.grButton);
        grButton.setOnClickListener(view -> getGroupsRequest());

        EditText employeeIdEdit = findViewById(R.id.employeeIdEdit);
        Button empScButton = findViewById(R.id.empScButton);
        empScButton.setOnClickListener(view -> getEmployeeScheduleRequest(employeeIdEdit.getText().toString()));

        EditText groupNoEdit = findViewById(R.id.groupNoEdit);
        Button grScButton = findViewById(R.id.grScButton);
        grScButton.setOnClickListener(view -> getGroupScheduleRequest(groupNoEdit.getText().toString())); */

        mService = BsuirService.retrofit.create(BsuirService.class);
    }

    private void getFacultiesRequest() {
        final Call<List<Faculty>> call = mService.getFaculties();

        call.enqueue(new Callback<List<Faculty>>() {
            @Override
            public void onResponse(Call<List<Faculty>> call, Response<List<Faculty>> response) {
                if (response.isSuccessful()) {
                    for (Faculty fac : response.body()) {
                        Log.d(FAC_TAG, fac.toString());
                    }
                } else {
                    ResponseBody errorBody = response.errorBody();
                    try {
                        Log.w(FAC_TAG, errorBody.string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Faculty>> call, Throwable t) {
                Log.e(FAC_TAG, "Something wrong: " + t.getMessage());
            }
        });
    }

    private void getSpecialitiesRequest() {
        final Call<List<Speciality>> call = mService.getSpecialities();

        call.enqueue(new Callback<List<Speciality>>() {
            @Override
            public void onResponse(Call<List<Speciality>> call, Response<List<Speciality>> response) {
                if (response.isSuccessful()) {
                    for (Speciality spec : response.body()) {
                        Log.d(SPEC_TAG, spec.toString());
                    }
                } else {
                    ResponseBody errorBody = response.errorBody();
                    try {
                        Log.w(SPEC_TAG, errorBody.string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Speciality>> call, Throwable t) {
                Log.e(SPEC_TAG, "Something wrong: " + t.getMessage());
            }
        });
    }

    private void getDepartmentsRequest() {
        final Call<List<Department>> call = mService.getDepartments();

        call.enqueue(new Callback<List<Department>>() {
            @Override
            public void onResponse(Call<List<Department>> call, Response<List<Department>> response) {
                if (response.isSuccessful()) {
                    for (Department dep : response.body()) {
                        Log.d(DEP_TAG, dep.toString());
                    }
                } else {
                    ResponseBody errorBody = response.errorBody();
                    try {
                        Log.w(DEP_TAG, errorBody.string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Department>> call, Throwable t) {
                Log.e(DEP_TAG, "Something wrong: " + t.getMessage());
            }
        });
    }

    private void getEmployeesRequest() {
        final Call<List<Employee>> call = mService.getEmployees();

        call.enqueue(new Callback<List<Employee>>() {
            @Override
            public void onResponse(Call<List<Employee>> call, Response<List<Employee>> response) {
                if (response.isSuccessful()) {
                    for (Employee emp : response.body()) {
                        Log.d(EMP_TAG, emp.toString());
                    }
                } else {
                    ResponseBody errorBody = response.errorBody();
                    try {
                        Log.w(EMP_TAG, errorBody.string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Employee>> call, Throwable t) {
                Log.e(EMP_TAG, "Something wrong: " + t.getMessage());
            }
        });
    }

    private void getGroupsRequest() {
        final Call<List<Group>> call = mService.getGroups();

        call.enqueue(new Callback<List<Group>>() {
            @Override
            public void onResponse(Call<List<Group>> call, Response<List<Group>> response) {
                if (response.isSuccessful()) {
                    for (Group gr : response.body()) {
                        Log.d(GR_TAG, gr.toString());
                    }
                } else {
                    ResponseBody errorBody = response.errorBody();
                    try {
                        Log.w(GR_TAG, errorBody.string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Group>> call, Throwable t) {
                Log.e(GR_TAG, "Something wrong: " + t.getMessage());
            }
        });
    }

    private void getEmployeeScheduleRequest(String employeeId) {
        final Call<EmployeeSchedule> call = mService.getEmployeeSchedule(employeeId);

        call.enqueue(new Callback<EmployeeSchedule>() {
            @Override
            public void onResponse(Call<EmployeeSchedule> call, Response<EmployeeSchedule> response) {
                if (response.isSuccessful()) {
                    Log.d(SCEMP_TAG, response.body().toString());
                } else {
                    ResponseBody errorBody = response.errorBody();
                    try {
                        Log.w(SCEMP_TAG, errorBody.string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<EmployeeSchedule> call, Throwable t) {
                Log.e(SCEMP_TAG, "Something wrong: " + t.getMessage());
            }
        });
    }

    private void getGroupScheduleRequest(String groupNo) {
        final Call<GroupSchedule> call = mService.getGroupSchedule(groupNo);

        call.enqueue(new Callback<GroupSchedule>() {
            @Override
            public void onResponse(Call<GroupSchedule> call, Response<GroupSchedule> response) {
                if (response.isSuccessful()) {
                    Log.d(SCGR_TAG, response.body().toString());
                } else {
                    ResponseBody errorBody = response.errorBody();
                    try {
                        Log.w(SCGR_TAG, errorBody.string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<GroupSchedule> call, Throwable t) {
                Log.e(SCGR_TAG, "Something wrong: " + t.getMessage());
            }
        });
    }
}
