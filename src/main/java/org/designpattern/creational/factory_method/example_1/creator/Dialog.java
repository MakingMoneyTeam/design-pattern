package org.designpattern.creational.factory_method.example_1.creator;

import org.designpattern.creational.factory_method.example_1.product.Button;

public abstract class Dialog {
    public void render() {
        Button okButton = createButton();
        Button cancelButton = createButton();
        okButton.render();
        cancelButton.render();
    }

    public abstract Button createButton();
}
