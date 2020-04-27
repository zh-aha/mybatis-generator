package com.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 5.枚举类型
 * 1）天然不支持反射创建对应的实例，且有自己的反序列化机制
 * 2）利用类加载机制保证线程安全
 */
public enum  EnumSingleton {

    INSTANCE;

    public void print(){
        System.out.println(this.hashCode());
    }

}
