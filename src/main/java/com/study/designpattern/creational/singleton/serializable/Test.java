package com.study.designpattern.creational.singleton.serializable;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        LazySingleton instance = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
//        HungrySingleton instance = HungrySingleton.getInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());
        System.out.println(instance.getData());


        //Serializable
        FileOutputStream fos = new FileOutputStream("Singleton.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instance);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("Singleton.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);

//        LazySingleton newInstance = (LazySingleton) ois.readObject();
//        LazyDoubleCheckSingleton newInstance = (LazyDoubleCheckSingleton) ois.readObject();
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) ois.readObject();
        EnumInstance newInstance = (EnumInstance) ois.readObject();

        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());
    }
}
