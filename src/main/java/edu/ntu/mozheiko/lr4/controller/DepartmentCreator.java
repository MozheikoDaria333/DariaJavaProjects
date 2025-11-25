package edu.ntu.mozheiko.lr4.controller;

import edu.ntu.mozheiko.lr4.model.Department;
import edu.ntu.mozheiko.lr4.model.Group;
import edu.ntu.mozheiko.lr4.model.Human;

public class DepartmentCreator {

    private final GroupCreator groupCreator = new GroupCreator();

    public Department createDepartmentWithTwoGroups(String name, Human head) {
        Department department = new Department(name, head);

        Group g1 = groupCreator.createGroupWithTwoStudents(name + " Гр1", head);
        Group g2 = groupCreator.createGroupWithTwoStudents(name + " Гр2", head);

        department.addGroup(g1);
        department.addGroup(g2);

        return department;
    }
}
