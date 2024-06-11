package com.ghedu.singleton;

public class InnerClass {
    private InnerClass() {
    }
    public static InnerClass getInstance() {
        return InnerCreator.inner;
    }
    // 静态内部类方式创建单例，可保证延迟加载，jvm保证并发问题
    private static class InnerCreator {
        public static final InnerClass inner = new InnerClass();
    }
}
