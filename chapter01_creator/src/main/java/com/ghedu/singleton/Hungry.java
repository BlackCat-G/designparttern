package com.ghedu.singleton;

public class Hungry {
    private static final Hungry hungry = new Hungry(); // 当类加载就创建
    // 1. 构造器私有化
    private Hungry() {
    }
    // 2. 返回唯一的实例对象
    public static Hungry getInstance() {
        return hungry;
    }
}
