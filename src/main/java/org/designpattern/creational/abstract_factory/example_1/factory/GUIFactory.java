package org.designpattern.creational.abstract_factory.example_1.factory;

import org.designpattern.creational.abstract_factory.example_1.product.checkbox.Checkbox;
import org.designpattern.creational.factory_method.example_1.product.Button;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
