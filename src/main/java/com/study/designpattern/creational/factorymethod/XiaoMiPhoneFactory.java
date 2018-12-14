package com.study.designpattern.creational.factorymethod;

public class XiaoMiPhoneFactory extends PhoneFactory {
    @Override
    public Phone produce() {
        return new XiaoMiPhone();
    }
}
