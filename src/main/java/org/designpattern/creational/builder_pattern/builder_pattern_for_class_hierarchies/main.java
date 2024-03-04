package org.designpattern.creational.builder_pattern.builder_pattern_for_class_hierarchies;

import static org.designpattern.creational.builder_pattern.builder_pattern_for_class_hierarchies.NyPizza.Size.SMALL;
import static org.designpattern.creational.builder_pattern.builder_pattern_for_class_hierarchies.Pizza.Topping.*;

public class main {
    public static void main(String[] args) {
        // Builder pattern for class hierarchies
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();

        System.out.println("NyPizza: " + pizza.toString());
        System.out.println("Calzone: " + calzone.toString());
    }
}
