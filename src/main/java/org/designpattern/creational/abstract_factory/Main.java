package org.designpattern.creational.abstract_factory;


import org.designpattern.creational.abstract_factory.example_1.Application;
import org.designpattern.creational.abstract_factory.example_1.factory.GUIFactory;
import org.designpattern.creational.abstract_factory.example_1.factory.MacOSFactory;
import org.designpattern.creational.abstract_factory.example_1.factory.WindowFactory;

public class Main {
    private static Application application;

    public static void main(String[] args) {
        config();
        application.render();
    }

    static void config() {
        GUIFactory factory;
        if (System.getProperty("os.name").equals("Mac OS X")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowFactory();
        }
        application = new Application(factory);
    }
}
