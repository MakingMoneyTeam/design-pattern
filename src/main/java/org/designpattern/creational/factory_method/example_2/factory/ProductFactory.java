package org.designpattern.creational.factory_method.example_2.factory;


import org.designpattern.creational.factory_method.example_2.product.Product;

public abstract class ProductFactory {
    public void anOperation() {
        Product product = createProduct();
        product.doStuff();
    }
    public abstract Product createProduct();
}
