package org.designpattern.creational.factory_method;

import org.designpattern.creational.factory_method.example_1.creator.Dialog;
import org.designpattern.creational.factory_method.example_1.creator.MacOSDialog;
import org.designpattern.creational.factory_method.example_1.creator.WindowDialog;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        config();
        dialog.render();
    }

    static void config() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = new MacOSDialog();
        } else {
            dialog = new WindowDialog();
        }
    }
}