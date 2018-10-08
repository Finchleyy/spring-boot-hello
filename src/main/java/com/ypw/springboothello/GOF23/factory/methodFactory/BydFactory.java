package com.ypw.springboothello.GOF23.factory.methodFactory;

public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}
