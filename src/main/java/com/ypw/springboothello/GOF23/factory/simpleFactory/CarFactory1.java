package com.ypw.springboothello.GOF23.factory.simpleFactory;

public class CarFactory1 {
    public static Car createCar(String carName) {
        if ("Audi".equals(carName)) {
            return new Audi();
        } else if ("Byd".equals(carName)) {
            return new Byd();
        } else {
            return null;
        }
    }
}
