package edu.ntu.mozheiko.lr4.controller;

import edu.ntu.mozheiko.lr4.model.Faculty;
import edu.ntu.mozheiko.lr4.model.Human;
import edu.ntu.mozheiko.lr4.model.Sex;
import edu.ntu.mozheiko.lr4.model.University;

public class UniversityCreator {

    private final FacultyCreator facultyCreator = new FacultyCreator();

    public University createTypicalUniversity() {
        Human rector = new Human("Дмитро", "Можейко", "Іванович", Sex.MALE);
        University university = new University("НТУ \"Прикладний\"", rector);

        Faculty f1 = facultyCreator.createFacultyWithTwoDepartments("ФІТ", rector);
        Faculty f2 = facultyCreator.createFacultyWithTwoDepartments("ФЕУ", rector);

        university.addFaculty(f1);
        university.addFaculty(f2);

        return university;
    }
}
