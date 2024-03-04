package org.designpattern.creational.abstract_factory.factory;

import org.designpattern.creational.abstract_factory.product.checkbox.Checkbox;
import org.designpattern.creational.abstract_factory.product.checkbox.WindowCheckbox;
import org.designpattern.creational.factory_method.product.Button;
import org.designpattern.creational.factory_method.product.WindowButton;

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
