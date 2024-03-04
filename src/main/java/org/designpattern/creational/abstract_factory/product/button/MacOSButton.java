package org.designpattern.creational.abstract_factory.product.button;

public class MacOSButton implements Button {
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
