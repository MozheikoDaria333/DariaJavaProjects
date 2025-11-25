package edu.ntu.mozheiko.lr4.model;

import java.util.Objects;

public abstract class UniversityUnit {
    private String name;
    private Human head;

    public UniversityUnit(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public UniversityUnit() {
        // для Gson
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniversityUnit)) return false;
        UniversityUnit that = (UniversityUnit) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head);
    }
}
