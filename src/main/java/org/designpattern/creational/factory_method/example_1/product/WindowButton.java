package org.designpattern.creational.factory_method.example_1.product;

public class WindowButton implements Button{
    @Override
    public void render() {
        System.out.println("Render WindowButton");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click WindowButton");
    }
}
