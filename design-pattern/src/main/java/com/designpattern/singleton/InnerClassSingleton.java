package com.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 3.静态内部类
 * 1).本质上是利用类的加载机制来保证线程安全
 * 2).只有在实际使用的时候，才会触发类的初始化，所以也是懒加载的一
 * 种形式。
 */
public class InnerClassSingleton {

    private static class InnerClassHolder{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton(){
        //静态内部类防止反射破坏
        if (InnerClassHolder.instance!=null){
            throw new RuntimeException("单例不允许多个实例");
        }
    }

    public static InnerClassSingleton getInstance(){
        return InnerClassHolder.instance;
    }

    // TODO: 2020/4/27 4.反射攻击实例：
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<InnerClassSingleton> declaredConstructor = InnerClassSingleton.class.getDeclaredConstructor();

        declaredConstructor.setAccessible(true);

        InnerClassSingleton innerClassSingleton = declaredConstructor.newInstance();

        InnerClassSingleton instance = InnerClassSingleton.getInstance();

        System.out.println(innerClassSingleton==instance);
    }

}
