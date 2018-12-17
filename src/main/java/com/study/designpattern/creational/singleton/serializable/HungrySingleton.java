package com.study.designpattern.creational.singleton.serializable;

import java.io.Serializable;

/**
 * 饿汉模式：类加载的时候就产生
 * 实现了序列化接口后需要重写readResolve方法防止序列化破坏单例模式
 */
public class HungrySingleton implements Serializable {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    //私有构造方法
    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}
