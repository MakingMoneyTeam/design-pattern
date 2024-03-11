package org.designpattern.creational.builder_pattern.builder_pattern_interface;

import org.designpattern.creational.builder_pattern.builder_pattern_interface.builder.ManualCarBuilder;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.director.Director;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product.ManualCar;

public class main {
    public static void main(String[] args) {
        // The client code creates a builder object, passes it to the director and then initiates the construction process. The end result is retrieved from the builder object.
        Director director = new Director();
        ManualCarBuilder builder = new ManualCarBuilder();
        director.constructSportsCar(builder);
        ManualCar car = builder.build();
        System.out.println("Car built: " + car.print());
    }
}
