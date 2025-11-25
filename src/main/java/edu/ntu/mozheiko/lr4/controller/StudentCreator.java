package edu.ntu.mozheiko.lr4.controller;

import edu.ntu.mozheiko.lr4.model.Sex;
import edu.ntu.mozheiko.lr4.model.Student;

public class StudentCreator {

    public Student createStudent(String firstName,
                                 String lastName,
                                 String middleName,
                                 Sex sex,
                                 String groupName) {
        return new Student(firstName, lastName, middleName, sex, groupName);
    }
}
