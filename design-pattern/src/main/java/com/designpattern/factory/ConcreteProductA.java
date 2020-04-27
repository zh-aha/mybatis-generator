package com.designpattern.factory;
// 工厂方法具体实现类
public class ConcreteProductA extends Application {
    @Override
    Product createProduct() {
        return new ProductA();
    }
}
