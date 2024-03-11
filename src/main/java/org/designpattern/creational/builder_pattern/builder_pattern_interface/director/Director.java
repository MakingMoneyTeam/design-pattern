package org.designpattern.creational.builder_pattern.builder_pattern_interface.director;

import org.designpattern.creational.builder_pattern.builder_pattern_interface.builder.Builder;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.car_enum.CarType;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.car_enum.Transmission;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.Engine;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.GPSNavigator;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR)
                .setEngine(new Engine(3.0, 0))
                .setSeats(2)
                .setTransmission(Transmission.SEMI_AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR)
                .setSeats(2)
                .setEngine(new Engine(1.2, 0))
                .setTransmission(Transmission.AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV)
                .setSeats(4)
                .setEngine(new Engine(2.5, 0))
                .setTransmission(Transmission.MANUAL)
                .setGPSNavigator(new GPSNavigator());
    }
}
