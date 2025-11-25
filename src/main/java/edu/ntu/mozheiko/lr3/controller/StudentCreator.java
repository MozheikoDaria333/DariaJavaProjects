package edu.ntu.mozheiko.lr3.controller;

import edu.ntu.mozheiko.lr3.model.Sex;
import edu.ntu.mozheiko.lr3.model.Student;

public class StudentCreator {

    public Student createStudent(String firstName,
                                 String lastName,
                                 String middleName,
                                 Sex sex,
                                 String groupName) {
        return new Student(firstName, lastName, middleName, sex, groupName);
    }
}
