package org.designpattern.creational.factory_method.creator;

import org.designpattern.creational.factory_method.product.Button;
import org.designpattern.creational.factory_method.product.MacOSButton;

public class MacOSDialog extends Dialog{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
