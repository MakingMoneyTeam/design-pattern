package org.designpattern.creational.abstract_factory.product.checkbox;

public class WindowCheckbox implements Checkbox{

    @Override
    public void render() {
        System.out.println("Render WindowCheckbox");
        onCheck();
    }

    @Override
    public void onCheck() {
        System.out.println("Check WindowCheckbox");
    }
}
