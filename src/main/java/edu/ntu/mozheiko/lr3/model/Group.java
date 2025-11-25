package edu.ntu.mozheiko.lr3.model;

import java.util.ArrayList;
import java.util.List;

public class Group extends UniversityUnit {

    private List<Student> students = new ArrayList<>();

    public Group(String name, Human head) {
        super(name, head);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
