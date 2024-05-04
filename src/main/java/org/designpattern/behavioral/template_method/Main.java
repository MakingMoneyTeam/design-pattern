package org.designpattern.behavioral.template_method;

import org.designpattern.behavioral.template_method.drink.DrinkRecipe;
import org.designpattern.behavioral.template_method.drink.LemonadeRecipe;
import org.designpattern.behavioral.template_method.drink.MilkTeaRecipe;

public class Main {
    public static void main(String[] args) {
        // Prepare milk tea
        DrinkRecipe milkTeaRecipe = new MilkTeaRecipe();
        System.out.println("Preparing milk tea...");
        milkTeaRecipe.prepareDrink();

        // Prepare lemonade
        DrinkRecipe lemonadeRecipe = new LemonadeRecipe();
        System.out.println("\nPreparing lemonade...");
        lemonadeRecipe.prepareDrink();
    }
}
