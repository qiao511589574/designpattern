package com.study.designpattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder().buildScreen("this is a screen")
                .buildBattery("this is a battery")
                .buildMicrophone("this is a microphone")
                .buildCamera("this is a camera")
                .buildButton("this is a button")
                .build();
        System.out.println(phone.toString());
    }
}
