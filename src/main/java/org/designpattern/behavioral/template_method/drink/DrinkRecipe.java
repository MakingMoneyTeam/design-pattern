package org.designpattern.behavioral.template_method.drink;

public abstract class DrinkRecipe {
    // Template method
    public final void prepareDrink() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void brew();
    protected abstract void addCondiments();

    // Common methods
    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
