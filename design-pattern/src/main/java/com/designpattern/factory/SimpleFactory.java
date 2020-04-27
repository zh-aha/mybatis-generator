package com.designpattern.factory;

/**
 * 简单工厂
 */
public class SimpleFactory {

    public static Product createProduct(String type){
        if (type.equals("a")){
            return new ProductA();
        }else if (type.equals("b")){
            return new ProductA1();
        }else {
            return null;
        }
    }

    public static void main(String[] args) {
        Product a = SimpleFactory.createProduct("a");
        a.method1();
    }
}
