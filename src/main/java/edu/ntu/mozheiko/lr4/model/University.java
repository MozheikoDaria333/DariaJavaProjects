package edu.ntu.mozheiko.lr4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University extends UniversityUnit {

    private List<Faculty> faculties = new ArrayList<>();

    public University(String name, Human head) {
        super(name, head);
    }

    public University() {
        // для Gson
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        if (!super.equals(o)) return false;
        University that = (University) o;
        return Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), faculties);
    }
}
