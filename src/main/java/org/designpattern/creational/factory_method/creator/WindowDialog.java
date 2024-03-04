package org.designpattern.creational.factory_method.creator;

import org.designpattern.creational.factory_method.product.Button;
import org.designpattern.creational.factory_method.product.WindowButton;

public class WindowDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
}
