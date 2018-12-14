package com.study.designpattern.creational.builder.v1;

/**
 * 手机产品类
 * 抽象手机只有屏幕Screen和电池Battery两个配件
 */
public class Phone {
    private Screen screen;
    private Battery battery;

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
