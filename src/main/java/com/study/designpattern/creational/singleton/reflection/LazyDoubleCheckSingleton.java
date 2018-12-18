package com.study.designpattern.creational.singleton.reflection;

import java.io.Serializable;

/**
 * 双重检查的懒汉模式，线程安全的写法
 * volatile关键字可以禁止线程内重排序
 * 实现了序列化接口后需要重写readResolve方法防止序列化破坏单例模式
 *
 * 反射攻击：（无法防御反射攻击）
 * 由于懒汉模式是什么时候用什么时候初始化，所以私有构造器中加上非空判断也无法防止反射攻击
 * 因为无法确定是先创建单例，还是先反射调用
 */
public class LazyDoubleCheckSingleton implements Serializable {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton;
    private LazyDoubleCheckSingleton(){
        //只能防止先初始化后反射调用的情况
        if (lazyDoubleCheckSingleton != null){
            throw new RuntimeException("懒汉模式被反射攻击");
        }
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

    //防止序列化破坏
    private Object readResolve(){
        return lazyDoubleCheckSingleton;
    }
}
