package com.ghedu.factory.abstractfactory;

public class SportsFactory implements CarFactory{
    @Override
    public BenzCar getBenz() {
        return new BenzSportsCar();
    }

    @Override
    public Tesla getTesla() {
        return new TeslaSportsCar();
    }
}
