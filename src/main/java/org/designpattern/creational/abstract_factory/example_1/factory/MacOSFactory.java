package org.designpattern.creational.abstract_factory.example_1.factory;

import org.designpattern.creational.abstract_factory.example_1.product.checkbox.Checkbox;
import org.designpattern.creational.abstract_factory.example_1.product.checkbox.MacOSCheckbox;
import org.designpattern.creational.factory_method.example_1.product.Button;
import org.designpattern.creational.factory_method.example_1.product.MacOSButton;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
