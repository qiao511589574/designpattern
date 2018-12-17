package com.study.designpattern.creational.singleton.reflection;

import java.io.Serializable;

/**
 * 饿汉模式：类加载的时候就产生
 * 实现了序列化接口后需要重写readResolve方法防止序列化破坏单例模式
 * 添加反射攻击的代码，由于饿汉模式是在类初始化时就生成成功，所以在私有构造器中加上非空判断可以防止反射调用
 */
public class HungrySingleton implements Serializable {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    //私有构造方法
    private HungrySingleton(){
        //防止反射破坏
        if(hungrySingleton != null){
            throw new RuntimeException("饿汉模式单例遭攻击");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    //实现序列化接口后重写readResolve方法防止序列化破坏
    private Object readResolve(){
        return hungrySingleton;
    }
}
