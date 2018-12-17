package com.study.designpattern.creational.singleton.reflection;

import java.io.Serializable;

/**
 * 私有静态内部类的单例模式
 * 实现了序列化接口后需要重写readResolve方法防止序列化破坏单例模式
 * 添加了防止反射攻击判断，私有静态内部类的单例模式是在类初始化时就生成成功，所以在私有构造器中加上非空判断可以防止反射调用
 */
public class StaticInnerClassSingleton implements Serializable {
    //私有构造器
    private StaticInnerClassSingleton(){
        //防止反射攻击
        if(InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("静态内部类单例模式被反射攻击");
        }
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
