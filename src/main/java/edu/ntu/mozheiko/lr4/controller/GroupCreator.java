package edu.ntu.mozheiko.lr4.controller;

import edu.ntu.mozheiko.lr4.model.Group;
import edu.ntu.mozheiko.lr4.model.Human;
import edu.ntu.mozheiko.lr4.model.Sex;
import edu.ntu.mozheiko.lr4.model.Student;

public class GroupCreator {

    private final StudentCreator studentCreator = new StudentCreator();

    public Group createGroupWithTwoStudents(String groupName, Human head) {
        Group group = new Group(groupName, head);

        Student s1 = studentCreator.createStudent(
                "Іван", "Іванов", "Іванович",
                Sex.MALE,
                groupName
        );

        Student s2 = studentCreator.createStudent(
                "Марія", "Петренко", "Олександрівна",
                Sex.FEMALE,
                groupName
        );

        group.addStudent(s1);
        group.addStudent(s2);

        return group;
    }
}
