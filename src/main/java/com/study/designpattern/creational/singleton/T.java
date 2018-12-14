package com.study.designpattern.creational.singleton;

public class T implements Runnable {
    public void run() {
//        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
//        System.out.println(lazyDoubleCheckSingleton);

        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        System.out.println(staticInnerClassSingleton);
    }
}
