package com.study.designpattern.creational.singleton.serializable;

import java.io.Serializable;

/**
 * 双重检查的懒汉模式，线程安全的写法
 * volatile关键字可以禁止线程内重排序
 * 实现了序列化接口后需要重写readResolve方法防止序列化破坏单例模式
 */
public class LazyDoubleCheckSingleton implements Serializable {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;
    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //new一个对象分三个步骤
                    //1.分配内存空间
                    //2.初始化对象
                    //3.对象指向内存空间
                    //intra-thread semantics 允许那些在单线程内，不会改变单线程程序执行结果的重排序，所以2.3可能重排序
                    //添加volatile关键字，可以禁止重排序。
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

    private Object readResolve(){
        return lazyDoubleCheckSingleton;
    }
}
