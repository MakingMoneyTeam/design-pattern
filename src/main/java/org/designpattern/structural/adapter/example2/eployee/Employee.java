package org.designpattern.structural.adapter.example2.eployee;

public class Employee {
    private String fullName;
    private String position;

    public Employee() {}

    public Employee(String fullName, int age, String position) {
        this.fullName = fullName;
        this.position = position;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }
}
