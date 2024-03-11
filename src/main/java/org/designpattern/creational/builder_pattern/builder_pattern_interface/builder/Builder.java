package org.designpattern.creational.builder_pattern.builder_pattern_interface.builder;

import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.car_enum.CarType;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.Engine;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.GPSNavigator;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.car_enum.Transmission;
import org.designpattern.creational.builder_pattern.builder_pattern_interface.entity.product_feature.TripComputer;

public interface Builder<T extends Builder<T, X>, X> {
    T setCarType(CarType type);
    T setSeats(int seats);
    T setEngine(Engine engine);
    T  setTransmission(Transmission transmission);
    T  setTripComputer(TripComputer tripComputer);
    T setGPSNavigator(GPSNavigator gpsNavigator);

    X build();
}
