package com.study.designpattern.creational.singleton.serializable;


import java.io.Serializable;

/**
 * 懒汉式单例模式
 * 单线程的情况下没有问题
 * 如果是多线程的话，可能多个线程同时判断lazySingleton==null = true，会出现隐患
 * 1.new了多个对象，但是返回的对象是最新产生的对象。
 * 2.由于线程的运行速度不同，可能会返回不同的对象。
 * 实现了序列化接口后需要重写readResolve方法防止序列化破坏单例模式
 */
public class LazySingleton implements Serializable {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(lazySingleton == null){    //如果多个线程同时进入，可能出现隐患
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    private Object readResolve(){
        return lazySingleton;
    }
}
