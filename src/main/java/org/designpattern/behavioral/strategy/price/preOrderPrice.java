package org.designpattern.behavioral.strategy.price;

public class preOrderPrice implements PriceStrategy {
    @Override
    public double calculatePrice(double price) {
        return price * 0.9;
    }
}
