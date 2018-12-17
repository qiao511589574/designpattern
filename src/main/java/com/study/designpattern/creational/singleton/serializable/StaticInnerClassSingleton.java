package com.study.designpattern.creational.singleton.serializable;

import java.io.Serializable;

/**
 * 私有静态内部类的单例模式
 * 实现了序列化接口后需要重写readResolve方法防止序列化破坏单例模式
 */
public class StaticInnerClassSingleton implements Serializable {
    //私有构造器
    private StaticInnerClassSingleton(){

    }

    //私有静态内部类
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

    //重写readResolve方法
    private Object readResolve(){
        return getInstance();
    }
}
