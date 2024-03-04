package org.designpattern.creational.abstract_factory.factory;

import org.designpattern.creational.abstract_factory.product.checkbox.Checkbox;
import org.designpattern.creational.abstract_factory.product.checkbox.MacOSCheckbox;
import org.designpattern.creational.factory_method.product.Button;
import org.designpattern.creational.factory_method.product.MacOSButton;

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
