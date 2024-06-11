package com.ghedu.singleton;

public class Lazy {
    private volatile static Lazy lazy;
    // 1. 构造器私有化
    private Lazy() {}
    // 2. 当需要时才获取
    public static Lazy getInstance() {
        return new Lazy();
    }
    // 多线程情况下会有同步问题
    public static Lazy getInstanceDoubleLock() {
        if (lazy == null) {
            synchronized (Lazy.class) {
                if (lazy == null) {
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }
}
