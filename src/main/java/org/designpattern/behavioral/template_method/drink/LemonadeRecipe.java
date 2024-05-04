package org.designpattern.behavioral.template_method.drink;

public class LemonadeRecipe extends DrinkRecipe {
    @Override
    protected void brew() {
        System.out.println("Squeeze lemon juice");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add sugar and water");
    }
}
