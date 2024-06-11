package com.ghedu.factory.abstractfactory;

public class BenzSportsCar implements BenzCar{
    @Override
    public void gasoline() {
        System.out.println("给奔驰跑车加最好的汽油");
    }
}
