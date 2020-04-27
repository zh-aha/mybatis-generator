package com.designpattern.factory;

abstract class Application {
    abstract Product createProduct();

    Product getObject(){
        Product product = createProduct();
        //...
        //...
        return product;
    }
}
