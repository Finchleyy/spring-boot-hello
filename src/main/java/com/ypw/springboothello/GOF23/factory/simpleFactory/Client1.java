package com.ypw.springboothello.GOF23.factory.simpleFactory;

public class Client1 {
    public static void main(String[] args) {
        Car audi = CarFactory1.createCar("Audi");
        audi.run();


    }
}
