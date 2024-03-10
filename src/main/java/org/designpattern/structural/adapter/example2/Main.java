package org.designpattern.structural.adapter.example2;

import org.designpattern.structural.adapter.example2.adapter.PersonToEmployeeAdapter;
import org.designpattern.structural.adapter.example2.person.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Long", "Tran", 21);
        PersonToEmployeeAdapter employee = new PersonToEmployeeAdapter(person);
        System.out.println(employee.getFullName());
        System.out.println(employee.getPosition());
    }
}
