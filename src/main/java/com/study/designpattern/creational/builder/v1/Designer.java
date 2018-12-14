package com.study.designpattern.creational.builder.v1;

public class Designer {
    public void command(PhoneBuilder builder){
        builder.MakeBattery();
        builder.MakeScreen();
    }
}
