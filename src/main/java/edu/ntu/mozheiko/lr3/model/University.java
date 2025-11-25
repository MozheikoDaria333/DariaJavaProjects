package edu.ntu.mozheiko.lr3.model;

import java.util.ArrayList;
import java.util.List;

public class University extends UniversityUnit {

    private List<Faculty> faculties = new ArrayList<>();

    public University(String name, Human head) {
        super(name, head);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
}
