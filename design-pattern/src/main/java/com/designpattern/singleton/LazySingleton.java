package com.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 1.懒汉模式：延迟加载， 只有在真正使用的时候，才开始实例化。
 * 1）线程安全问题
 * 2）double check 加锁优化
 * 3）编译器(JIT),CPU 有可能对指令进行重排序，导致使用到尚未初始化
 * 的实例，可以通过添加volatile 关键字进行修饰，
 * 对于volatile 修饰的字段，可以防止指令重排。
 */
public class LazySingleton {

    private volatile static LazySingleton instance;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        //双重检查锁
        if (instance==null){
            synchronized (LazySingleton.class){
                if (instance == null){
                    instance=new LazySingleton();
                }
            }
        }
        return instance;
    }


}
