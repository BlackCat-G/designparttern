package com.ghedu.factory.abstractfactory;

public class BusinessFactory implements CarFactory{
    @Override
    public BenzCar getBenz() {
        return new BenzBusinessCar();
    }

    @Override
    public Tesla getTesla() {
        return new TeslaBusinessCar();
    }
}
