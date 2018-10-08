package com.ypw.springboothello.GOF23.builder;

public class Client {
    public static void main(String[] args) {
        AirShipDirector airShipDirector = new YPWAirshipDirector();
        AirShipBuilder airShipBuilder = new YPWAirShipBuilder();
        AirShip airShip = airShipDirector.directAirShip(airShipBuilder);
        System.out.println(airShip.getEngine().getName());
        System.out.println(airShip.getEscapeTower().getName());
        airShip.launch();
    }


}
