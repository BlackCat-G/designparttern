package com.ghedu.factory.simple;

public class Div extends Operation{
    @Override
    protected double opation() {
        if (getNum02() == 0) {
            throw new IllegalArgumentException("除数不能为0！！！");
        }
        return getNum01() / getNum02();
    }
}
