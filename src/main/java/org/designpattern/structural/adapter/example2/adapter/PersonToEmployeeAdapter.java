package org.designpattern.structural.adapter.example2.adapter;

import org.designpattern.structural.adapter.example2.eployee.Employee;
import org.designpattern.structural.adapter.example2.person.Person;

public class PersonToEmployeeAdapter extends Employee {
    private final Person person;

    public PersonToEmployeeAdapter(Person person) {
        this.person = person;
    }

    @Override
    public String getFullName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    @Override
    public String getPosition() {
        return "Unknown";
    }
}
