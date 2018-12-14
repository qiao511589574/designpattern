package com.study.designpattern.creational.builder.v1;

public class Boss {
    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new PhoneBuilderImpl();
        Designer designer = new Designer();
        designer.command(phoneBuilder);
        Phone phone = phoneBuilder.getPhone();
    }
}
