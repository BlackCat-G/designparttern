package com.ghedu.factory.abstractfactory;

public class BenzBusinessCar implements BenzCar{
    @Override
    public void gasoline() {
        System.out.println("给我的奔驰商务加一般的汽油");
    }
}
