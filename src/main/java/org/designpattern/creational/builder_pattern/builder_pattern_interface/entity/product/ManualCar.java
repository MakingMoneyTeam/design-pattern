package org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product;

import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.car_enum.CarType;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.Engine;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.GPSNavigator;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.car_enum.Transmission;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.TripComputer;

public class ManualCar {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public ManualCar(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
