package edu.ntu.mozheiko.lr3.model;

public abstract class UniversityUnit {
    private String name;
    private Human head;

    public UniversityUnit(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    @Override
    public String toString() {
        return name + ", голова: " + head;
    }
}
