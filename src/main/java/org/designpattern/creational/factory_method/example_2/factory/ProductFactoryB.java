package org.designpattern.creational.factory_method.example_2.factory;

import org.designpattern.creational.factory_method.example_2.product.ConcreteProductB;
import org.designpattern.creational.factory_method.example_2.product.Product;

public class ProductFactoryB extends ProductFactory{
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
