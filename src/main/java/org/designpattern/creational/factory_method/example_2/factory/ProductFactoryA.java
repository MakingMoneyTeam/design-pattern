package org.designpattern.creational.factory_method.example_2.factory;


import org.designpattern.creational.factory_method.example_2.product.ConcreteProductA;
import org.designpattern.creational.factory_method.example_2.product.Product;

public class ProductFactoryA extends ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
