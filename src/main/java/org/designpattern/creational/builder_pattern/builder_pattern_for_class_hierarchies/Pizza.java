package org.designpattern.creational.builder_pattern.builder_pattern_for_class_hierarchies;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * Abstract Builder for class hierarchies
 * @Author: nvtuanqti21
 * @Date: 04/06/2021
 * @Purpose: To demonstrate the Builder pattern for class hierarchies.
 */
public abstract class Pizza {
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;

    /**
     * Abstract Builder
     * @param <T>
     *
     *     The type of the builder
     *     This type parameter is the so-called "self type," meaning it is the type of the
     *     class for which the builder is defined. It allows method to be chained in subclasses.
     *     This is known as the simulated self-type idiom.
     */
    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        abstract Pizza build();
        // Subclasses must override this method to return "this"
        protected abstract T self();
    }

    /**
     * Constructor for Pizza
     * @param builder
     * this constructor is package-private
     * Why we use clone here?
     * Because the toppings set is a reference to a mutable object, the clone method is used to
     * defensively copy the object. This prevents the builder from being able to change the
     * toppings set after the pizza has been built.
     */
    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone(); // See Item 50
    }

    //write abstract method toString()
    public abstract String toString();
}
