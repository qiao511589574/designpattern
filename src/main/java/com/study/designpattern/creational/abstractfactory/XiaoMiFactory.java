package com.study.designpattern.creational.abstractfactory;

public class XiaoMiFactory extends Factory {
    @Override
    public Phone producePhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Computer produceComputer() {
        return new XiaoMiComputer();
    }
}
