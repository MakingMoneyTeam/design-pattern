package org.designpattern.creational.abstract_factory.example_1.factory;

import org.designpattern.creational.abstract_factory.example_1.product.checkbox.Checkbox;
import org.designpattern.creational.abstract_factory.example_1.product.checkbox.WindowCheckbox;
import org.designpattern.creational.factory_method.example_1.product.Button;
import org.designpattern.creational.factory_method.example_1.product.WindowButton;

public class WindowFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }
}
