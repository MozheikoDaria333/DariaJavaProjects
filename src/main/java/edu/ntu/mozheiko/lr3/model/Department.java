package edu.ntu.mozheiko.lr3.model;

import java.util.ArrayList;
import java.util.List;

public class Department extends UniversityUnit {

    private List<Group> groups = new ArrayList<>();

    public Department(String name, Human head) {
        super(name, head);
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }
}
