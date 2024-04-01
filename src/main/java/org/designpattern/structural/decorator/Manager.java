package org.designpattern.structural.decorator;

import org.designpattern.structural.decorator.employee.EmployeeComponent;
import org.designpattern.structural.decorator.employee.EmployeeDecorator;

public class Manager extends EmployeeDecorator {
    protected Manager(EmployeeComponent employee) {
        super(employee);
    }

    public void createRequirement() {
        System.out.println(this.employee.getName() + " is create requirements.");
    }

    public void assignTask() {
        System.out.println(this.employee.getName() + " is assigning tasks.");
    }

    public void manageProgress() {
        System.out.println(this.employee.getName() + " is managing the progress.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        createRequirement();
        assignTask();
        manageProgress();
    }
}
