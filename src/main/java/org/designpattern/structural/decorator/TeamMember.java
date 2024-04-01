package org.designpattern.structural.decorator;

import org.designpattern.structural.decorator.employee.EmployeeComponent;
import org.designpattern.structural.decorator.employee.EmployeeDecorator;

public class TeamMember extends EmployeeDecorator {
    protected TeamMember(EmployeeComponent employee) {
        super(employee);
    }

    public void reportTask() {
        System.out.println(this.employee.getName() + " is reporting his assigned tasks.");
    }

    public void coordinateWithOthers() {
        System.out.println(this.employee.getName() + " is coordinating with other members of his team.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        reportTask();
        coordinateWithOthers();
    }
}
