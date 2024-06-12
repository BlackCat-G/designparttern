package com.ghedu.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

public class DataQueryInvocationHanlder implements InvocationHandler {
    private Map<String,String> cacheMap = new LinkedHashMap<>();
    private final DataQuery dataQuery;
    {
        dataQuery = new UserDataQuery();
    }
    /**
     *
     * @param proxy the proxy instance that the method was invoked on
     *
     * @param method the {@code Method} instance corresponding to
     * the interface method invoked on the proxy instance.  The declaring
     * class of the {@code Method} object will be the interface that
     * the method was declared in, which may be a superinterface of the
     * proxy interface that the proxy class inherits the method through.
     *
     * @param args an array of objects containing the values of the
     * arguments passed in the method invocation on the proxy instance,
     * or {@code null} if interface method takes no arguments.
     * Arguments of primitive types are wrapped in instances of the
     * appropriate primitive wrapper class, such as
     * {@code java.lang.Integer} or {@code java.lang.Boolean}.
     *
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String res;
        if ("query".equals(method.getName())) {
            String param;
            if ((param = args[0].toString() )!= null) {
                res = cacheMap.get(param);
                if (res != null) {
                    System.out.println("返回缓存结果：" + res);
                    return res;
                }
                String queryRes = (String) method.invoke(dataQuery, args);
                if (queryRes != null) {
                    cacheMap.put(param, queryRes);
                    System.out.println("数据库查询结果：" + queryRes);
                    return queryRes;
                }
            }
        }
        return method.invoke(dataQuery, args);
    }
}
