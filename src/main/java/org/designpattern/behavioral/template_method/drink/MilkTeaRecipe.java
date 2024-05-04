package org.designpattern.behavioral.template_method.drink;

public class MilkTeaRecipe extends DrinkRecipe {
    @Override
    protected void brew() {
        System.out.println("Steep tea bag in hot water");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add milk and sugar");
    }
}
