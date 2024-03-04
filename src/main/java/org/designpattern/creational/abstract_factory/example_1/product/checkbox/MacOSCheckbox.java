package org.designpattern.creational.abstract_factory.example_1.product.checkbox;

public class MacOSCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Render MacOSCheckbox");
        onCheck();
    }

    @Override
    public void onCheck() {
        System.out.println("Check MacOSCheckbox");
    }
}
