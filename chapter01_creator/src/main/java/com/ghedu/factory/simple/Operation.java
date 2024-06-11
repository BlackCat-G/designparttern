package com.ghedu.factory.simple;

public abstract class Operation {
    private double num01;
    private double num02;

    public Operation() {
    }

    public Operation(double num01, double num02) {
        this.num01 = num01;
        this.num02 = num02;
    }

    public double getNum01() {
        return num01;
    }

    public void setNum01(double num01) {
        this.num01 = num01;
    }

    public double getNum02() {
        return num02;
    }

    public void setNum02(double num02) {
        this.num02 = num02;
    }
    abstract protected double opation();

}
