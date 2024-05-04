package org.designpattern.behavioral.strategy.price;

public class blackFridayPrice implements PriceStrategy {
    @Override
    public double calculatePrice(double price) {
        return price * 0.7;
    }
}
