package org.designpattern.creational.factory_method.example_1.creator;

import org.designpattern.creational.factory_method.example_1.product.Button;
import org.designpattern.creational.factory_method.example_1.product.WindowButton;

public class WindowDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
