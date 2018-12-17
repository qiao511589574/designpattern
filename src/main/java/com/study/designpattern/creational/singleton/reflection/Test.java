package com.study.designpattern.creational.singleton.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class objectClass = HungrySingleton.class;
//        Class objectClass = StaticInnerClassSingleton.class;

        Class objectClass = EnumInstance.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
//        HungrySingleton instance = HungrySingleton.getInstance();
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();

        EnumInstance instance = EnumInstance.getInstance();
        EnumInstance newInstance = (EnumInstance) constructor.newInstance();


        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }


}
