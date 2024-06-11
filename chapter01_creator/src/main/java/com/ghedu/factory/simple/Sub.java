package com.ghedu.factory.simple;

public class Sub extends Operation{
    @Override
    protected double opation() {
        return getNum01() - getNum02();
    }
}
