package com.ghedu.proxy.dynamic.jdk;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestDynamic {
    @Test
    public void test() {
        // 1. arg1：classLoader
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        // 2. 被代理接口
        Class clazz[] = new Class[]{DataQuery.class};
        // 3. 代理后增强逻辑
        InvocationHandler invocationHandler = new DataQueryInvocationHanlder();
        DataQuery dataQuery = (DataQuery) Proxy.newProxyInstance(contextClassLoader,
                clazz,
                invocationHandler);
        dataQuery.query("key01");
        dataQuery.query("key01");
        dataQuery.query("key02");
        dataQuery.queryAll("key");
        dataQuery.queryAll("key");
        dataQuery.queryAll("key");
    }
}
