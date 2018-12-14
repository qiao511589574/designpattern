package com.study.designpattern.creational.factorymethod;

public class Test {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new XiaoMiPhoneFactory();
        Phone phone = phoneFactory.produce();
        phone.play();
    }
}
