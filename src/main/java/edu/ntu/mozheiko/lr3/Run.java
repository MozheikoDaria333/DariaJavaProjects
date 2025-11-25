package edu.ntu.mozheiko.lr3;

import edu.ntu.mozheiko.lr3.controller.UniversityCreator;
import edu.ntu.mozheiko.lr3.model.*;

public class Run {
    public static void main(String[] args) {
        UniversityCreator creator = new UniversityCreator();
        University university = creator.createTypicalUniversity();

        printUniversityInfo(university);
    }

    private static void printUniversityInfo(University university) {
        System.out.println("Університет: " + university);

        for (Faculty faculty : university.getFaculties()) {
            System.out.println("  Факультет: " + faculty);
            for (Department department : faculty.getDepartments()) {
                System.out.println("    Кафедра: " + department);
                for (Group group : department.getGroups()) {
                    System.out.println("      Група: " + group);
                    for (Student student : group.getStudents()) {
                        System.out.println("        Студент: " + student);
                    }
                }
            }
        }
    }
}
