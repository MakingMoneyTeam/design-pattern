package org.designpattern.creational.abstract_factory.factory;

import org.designpattern.creational.abstract_factory.product.checkbox.Checkbox;
import org.designpattern.creational.factory_method.product.Button;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
