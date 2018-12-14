package com.study.designpattern.creational.builder.v2;

public class Phone {
    private String screen;
    private String battery;
    private String microphone;
    private String camera;
    private String button;

    public Phone(PhoneBuilder phoneBuilder) {
        this.screen = phoneBuilder.screen;
        this.battery = phoneBuilder.battery;
        this.microphone = phoneBuilder.microphone;
        this.camera = phoneBuilder.camera;
        this.button = phoneBuilder.button;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screen='" + screen + '\'' +
                ", battery='" + battery + '\'' +
                ", microphone='" + microphone + '\'' +
                ", camera='" + camera + '\'' +
                ", button='" + button + '\'' +
                '}';
    }

    public static class PhoneBuilder{
        private String screen;
        private String battery;
        private String microphone;
        private String camera;
        private String button;

        public PhoneBuilder buildScreen(String screen){
            this.screen = screen;
            return this;
        }
        public PhoneBuilder buildBattery(String battery){
            this.battery = battery;
            return this;
        }
        public PhoneBuilder buildMicrophone(String microphone){
            this.microphone = microphone;
            return this;
        }
        public PhoneBuilder buildCamera(String camera){
            this.camera = camera;
            return this;
        }
        public PhoneBuilder buildButton(String button){
            this.button = button;
            return this;
        }
        public Phone build(){
            return new Phone(this);
        }
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getMicrophone() {
        return microphone;
    }

    public void setMicrophone(String microphone) {
        this.microphone = microphone;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }
}
