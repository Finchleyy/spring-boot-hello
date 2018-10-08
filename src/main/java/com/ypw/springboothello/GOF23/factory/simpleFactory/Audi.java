package com.ypw.springboothello.GOF23.factory.simpleFactory;

public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("Audi Run");
    }
}
