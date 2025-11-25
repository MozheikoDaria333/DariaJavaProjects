package edu.ntu.mozheiko.lr3.controller;

import edu.ntu.mozheiko.lr3.model.Faculty;
import edu.ntu.mozheiko.lr3.model.Human;
import edu.ntu.mozheiko.lr3.model.Sex;
import edu.ntu.mozheiko.lr3.model.University;

public class UniversityCreator {

    private final FacultyCreator facultyCreator = new FacultyCreator();

    public University createTypicalUniversity() {
        Human rector = new Human("Дмитро", "Можейко", "Іванович", Sex.MALE);
        University university = new University("НТУ \"Приклад\"", rector);

        Faculty f1 = facultyCreator.createFacultyWithTwoDepartments("ФІТ", rector);
        Faculty f2 = facultyCreator.createFacultyWithTwoDepartments("ФЕУ", rector);

        university.addFaculty(f1);
        university.addFaculty(f2);

        return university;
    }
}
