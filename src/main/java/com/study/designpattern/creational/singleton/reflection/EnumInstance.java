package com.study.designpattern.creational.singleton.reflection;

/**
 * 枚举模式，最优选择
 * 自身就可以防止序列化破坏和反射攻击
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
