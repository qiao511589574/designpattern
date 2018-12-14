package com.study.designpattern.creational.builder.v1;

public class PhoneBuilderImpl implements PhoneBuilder {
    private Phone phone = new Phone();
    public void MakeScreen() {
        System.out.println("PhoneBuilderImpl MakeScreen");
        phone.setScreen(new Screen());
    }

    public void MakeBattery() {
        System.out.println("PhoneBuilderImpl MakeBattery");
        phone.setBattery(new Battery());
    }

    public Phone getPhone() {
        return phone;
    }
}
