package com.ypw.springboothello.GOF23.factory.methodFactory;

public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
