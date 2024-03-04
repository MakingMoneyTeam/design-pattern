package org.designpattern.creational.factory_method.example_2.product;

public class ConcreteProductA implements Product{
    @Override
    public void doStuff() {
        System.out.println("Doing stuff with product A");
    }
}
