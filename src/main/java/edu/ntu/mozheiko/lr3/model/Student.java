package edu.ntu.mozheiko.lr3.model;

public class Student extends Human {

    private String groupName;

    public Student(String firstName, String lastName, String middleName, Sex sex, String groupName) {
        super(firstName, lastName, middleName, sex);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return super.toString() + ", група: " + groupName;
    }
}
