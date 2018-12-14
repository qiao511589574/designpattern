package com.study.designpattern.creational.abstractfactory;

public class HuaWeiFactory extends Factory {
    @Override
    public Phone producePhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Computer produceComputer() {
        return new HuaWeiComputer();
    }
}
