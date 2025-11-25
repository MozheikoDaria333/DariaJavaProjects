package edu.ntu.mozheiko.lr3.controller;

import edu.ntu.mozheiko.lr3.model.Department;
import edu.ntu.mozheiko.lr3.model.Faculty;
import edu.ntu.mozheiko.lr3.model.Human;

public class FacultyCreator {

    private final DepartmentCreator departmentCreator = new DepartmentCreator();

    public Faculty createFacultyWithTwoDepartments(String name, Human head) {
        Faculty faculty = new Faculty(name, head);

        Department d1 = departmentCreator.createDepartmentWithTwoGroups(name + " Кафедра 1", head);
        Department d2 = departmentCreator.createDepartmentWithTwoGroups(name + " Кафедра 2", head);

        faculty.addDepartment(d1);
        faculty.addDepartment(d2);

        return faculty;
    }
}
