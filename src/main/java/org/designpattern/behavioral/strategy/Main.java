package org.designpattern.behavioral.strategy;

import org.designpattern.behavioral.strategy.price.PriceContext;
import org.designpattern.behavioral.strategy.price.blackFridayPrice;
import org.designpattern.behavioral.strategy.price.preOrderPrice;

public class Main {
    public static void main(String[] args) {
        PriceContext priceContext = new PriceContext(new preOrderPrice());
        System.out.println(priceContext.calculatePrice(100));

        priceContext.setStrategy(new blackFridayPrice());
        System.out.println(priceContext.calculatePrice(100));
    }
}
