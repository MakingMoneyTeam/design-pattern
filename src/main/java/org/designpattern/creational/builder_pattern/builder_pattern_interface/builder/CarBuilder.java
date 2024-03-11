package org.designpattern.creational.builder_pattern.builder_pattern_interface.builder;

import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.car_enum.CarType;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product.Car;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.Engine;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.GPSNavigator;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.car_enum.Transmission;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.TripComputer;

public class CarBuilder implements Builder<CarBuilder, Car>{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public CarBuilder setCarType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public CarBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Car build() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
