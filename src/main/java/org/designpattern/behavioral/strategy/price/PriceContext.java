package org.designpattern.behavioral.strategy.price;

public class PriceContext {
    private PriceStrategy price;

    public PriceContext(PriceStrategy price) {
        this.price = price;
    }

    public double calculatePrice(double price) {
        return this.price.calculatePrice(price);
    }
}
