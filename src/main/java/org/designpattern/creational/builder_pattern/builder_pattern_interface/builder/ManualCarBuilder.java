package org.designpattern.creational.builder_pattern.builder_pattern_interface.builder;

import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.car_enum.CarType;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product.ManualCar;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.Engine;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.GPSNavigator;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.car_enum.Transmission;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.TripComputer;

public class ManualCarBuilder implements Builder<ManualCarBuilder, ManualCar>{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public ManualCarBuilder setCarType(CarType type) {
        this.type = type;
        return this;
    }

    @Override
    public ManualCarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public ManualCarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public ManualCarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public ManualCarBuilder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public ManualCarBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public ManualCar build() {
        return new ManualCar(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
