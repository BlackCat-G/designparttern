package com.ghedu.proxy.staticproxy;

import java.util.HashMap;
import java.util.Map;

public class UserDataQueryProxy implements DataQuery{
    // 注入被代理类
    private DataQuery dataQuery;
    // 缓存结果
    private Map<String, String> map = new HashMap<>();

    {
        dataQuery = new UserDataQuery();
    }

    @Override
    public String query(String queryKey) {
        String res = map.get(queryKey);
        if (res != null) {
            System.out.println("缓存命中，返回结果：" + res);
            return res;
        }
        String queryRes = dataQuery.query(queryKey);
        if (queryRes != null) {
            map.put(queryKey, queryRes);
            System.out.println("缓存未命中，结果为：" + queryRes);
        }
        return queryKey;
    }
}
