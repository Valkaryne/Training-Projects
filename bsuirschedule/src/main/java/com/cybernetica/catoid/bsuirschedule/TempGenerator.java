package com.cybernetica.catoid.bsuirschedule;

import com.cybernetica.catoid.bsuirschedule.RequestModels.Employee;
import com.cybernetica.catoid.bsuirschedule.RequestModels.Schedule;
import com.cybernetica.catoid.bsuirschedule.RequestModels.ScheduleModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TempGenerator {
    private String studentGroup;
    private List<Schedule> schedules;
    private String todayDate;
    private List<ScheduleModel> todaySchedules;
    private String tomorrowDate;
    private List<ScheduleModel> tomorrowSchedules;

    private Employee emMurashkina, emKirvel, emDvornikova, emSemijon;

    public TempGenerator() {
        studentGroup = "741301";
        todayDate = "3 марта 2019 г.";
        tomorrowDate = "4 марта 2019 г.";

        initEmployees();
        initTodaySchedules();
        initTomorrowSchedules();
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public String getTodayDate() {
        return todayDate;
    }

    public String getTomorrowDate() {
        return tomorrowDate;
    }

    public List<ScheduleModel> getTodaySchedules() {
        return todaySchedules;
    }

    public List<ScheduleModel> getTomorrowSchedules() {
        return tomorrowSchedules;
    }

    private void initTodaySchedules() {
        todaySchedules = new ArrayList<>();
    }

    private void initTomorrowSchedules() {
        tomorrowSchedules = new ArrayList<>();

        // КЧ (ПЗ)
        ScheduleModel model = new ScheduleModel();
        model.setAuditory(Arrays.asList("334-1"));
        model.setEmployee(Arrays.asList(emMurashkina));
        model.setStartLessonTime("08:00");
        model.setEndLessonTime("09:35");
        model.setLessonTime("08:00-09:35");
        model.setLessonType("ПЗ");
        model.setWeekNumber(Arrays.asList(2, 4));
        model.setSubject("КЧ");
        tomorrowSchedules.add(model);

        // БЖЧ (ЛК)
        model = new ScheduleModel();
        model.setAuditory(Arrays.asList("206-3"));
        model.setEmployee(Arrays.asList(emKirvel));
        model.setStartLessonTime("09:45");
        model.setEndLessonTime("11:20");
        model.setLessonTime("09:45-11:20");
        model.setLessonType("ЛК");
        model.setWeekNumber(Arrays.asList(0, 1, 2, 3, 4));
        model.setSubject("БЖЧ");
        tomorrowSchedules.add(model);

        // ФизК
        model = new ScheduleModel();
        model.setStartLessonTime("11:40");
        model.setEndLessonTime("13:15");
        model.setLessonTime("11:40-13:15");
        model.setLessonType("ПЗ");
        model.setWeekNumber(Arrays.asList(0, 1, 2, 3, 4));
        model.setSubject("ФизК");
        tomorrowSchedules.add(model);

        // ФУР (ЛК)
        model = new ScheduleModel();
        model.setAuditory(Arrays.asList("347-1"));
        model.setEmployee(Arrays.asList(emDvornikova));
        model.setStartLessonTime("13:25");
        model.setEndLessonTime("15:00");
        model.setLessonTime("13:25-15:00");
        model.setLessonType("ЛК");
        model.setWeekNumber(Arrays.asList(0, 1, 2, 3, 4));
        model.setSubject("ФУР");
        tomorrowSchedules.add(model);

        // ТВиМС (ПЗ)
        model = new ScheduleModel();
        model.setAuditory(Arrays.asList("420-4"));
        model.setEmployee(Arrays.asList(emSemijon));
        model.setStartLessonTime("15:20");
        model.setEndLessonTime("16:55");
        model.setLessonTime("15:20-16:55");
        model.setLessonType("ПЗ");
        model.setWeekNumber(Arrays.asList(2, 3, 4));
        model.setSubject("ТВиМС");
        tomorrowSchedules.add(model);
    }

    private void initEmployees() {
        // Мурашкина З.Н.
        emMurashkina = new Employee();
        emMurashkina.setFio("Мурашкина З.Н.");
        emMurashkina.setFirstName("Зоя");
        emMurashkina.setLastName("Мурашкина");
        emMurashkina.setMiddleName("Николаевна");

        // Кирвель П.И.
        emKirvel = new Employee();
        emKirvel.setFio("Кирвель П.И.");
        emKirvel.setFirstName("Павел");
        emKirvel.setLastName("Кирвель");
        emKirvel.setMiddleName("Иванович");

        // Дворникова Т.Н.
        emDvornikova = new Employee();
        emDvornikova.setFio("Дворникова Т.Н.");
        emDvornikova.setFirstName("Татьяна");
        emDvornikova.setLastName("Дворникова");
        emDvornikova.setMiddleName("Николаевна");

        // Семижон Е.А.
        emSemijon = new Employee();
        emSemijon.setFio("Семижон Е.А.");
        emSemijon.setFirstName("Екатерина");
        emSemijon.setLastName("Семижон");
        emSemijon.setMiddleName("Александровна");
    }
}
