package com.study.designpattern.creational.builder.v1;

public interface PhoneBuilder {
    void MakeScreen();
    void MakeBattery();
    Phone getPhone();
}
