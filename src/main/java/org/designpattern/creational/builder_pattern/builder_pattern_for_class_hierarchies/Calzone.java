package org.designpattern.creational.builder_pattern.builder_pattern_for_class_hierarchies;

/**
 * Calzone is a subclass of Pizza
 */
public class Calzone extends Pizza{
    private final boolean sauceInside;


    public static class Builder extends Pizza.Builder<Builder>{
        private boolean sauceInside = false; // Default

        public Builder sauceInside(){
            sauceInside = true;
            return this;
        }
        @Override
        Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "Calzone{" +
                "sauceInside=" + sauceInside +
                ", toppings=" + toppings +
                '}';
    }
}
