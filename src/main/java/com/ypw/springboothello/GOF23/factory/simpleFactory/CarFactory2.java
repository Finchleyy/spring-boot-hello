package com.ypw.springboothello.GOF23.factory.simpleFactory;

public class CarFactory2 {
    public static  Car createAudi(){
        return new Audi();
    }
    public static  Car createByd(){
        return new Byd();
    }
}
