package com.study.designpattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        Factory factory = new XiaoMiFactory();
        Phone phone = factory.producePhone();
        Computer computer = factory.produceComputer();
        phone.play();
        computer.play();
    }
}
