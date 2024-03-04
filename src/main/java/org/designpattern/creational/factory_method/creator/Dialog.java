package org.designpattern.creational.factory_method.creator;

import org.designpattern.creational.factory_method.product.Button;

public abstract class Dialog {
    public void render() {
        Button okButton = createButton();
        Button cancelButton = createButton();
        okButton.render();
        cancelButton.render();
    }

    public abstract Button createButton();
}
