package com.study.designpattern.creational.singleton;

/**
 * 饿汉模式：类加载的时候就产生
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    //私有构造方法
    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
