package org.designpattern.creational.abstract_factory.example_1;

import org.designpattern.creational.abstract_factory.example_1.factory.GUIFactory;
import org.designpattern.creational.abstract_factory.example_1.product.checkbox.Checkbox;
import org.designpattern.creational.factory_method.example_1.product.Button;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }
}
