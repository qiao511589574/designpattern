package com.study.designpattern.creational.factorymethod;

public class HuaWeiPhoneFactory extends PhoneFactory {
    @Override
    public Phone produce() {
        return new HuaWeiPhone();
    }
}
