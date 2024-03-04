package org.designpattern.creational.factory_method.product;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("Render MacOSButton");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click MacOSButton");
    }
}
