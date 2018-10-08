package com.ypw.springboothello.GOF23.factory.methodFactory;

public class Client {
    public static void main(String[] args) {
        Car audi = new AudiFactory().createCar();
        audi.run();
        Car byd = new BydFactory().createCar();
        byd.run();
    }
}
