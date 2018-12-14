package com.study.designpattern.creational.singleton;

/**
 * 私有静态内部类的单例模式
 */
public class StaticInnerClassSingleton {
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

}
