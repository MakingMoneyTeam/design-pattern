package org.designpattern.behavioral.strategy.price;

public class PriceContext {
    private PriceStrategy strategy;

    public PriceContext(PriceStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PriceStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(double price) {
        return this.strategy.calculatePrice(price);
    }
}
