package com.ghedu.proxy.staticproxy;

public class UserDataQuery implements DataQuery{
    @Override
    public String query(String queryKey) {
        System.out.println("持久层正在查询...");
        return  "本次查询key：" + queryKey + "结果为：test";
    }
}
