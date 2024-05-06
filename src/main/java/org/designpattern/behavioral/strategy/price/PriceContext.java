package org.designpattern.behavioral.strategy.price;

public class PriceContext {
    private PriceStrategy strategy;

    public PriceContext(PriceStrategy pristrategyce) {
        this.strategy = strategy;
    }

    public setStrategy(PriceStrategy strategy) {
        this.price = strategy
    }

    public double calculatePrice(double price) {
        return this.price.calculatePrice(price);
    }
}
