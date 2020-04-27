package com.designpattern.factory;

public class ConcreteProductA1 extends Application {
    @Override
    Product createProduct() {
        return new ProductA();
    }
}
