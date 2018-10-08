package com.ypw.springboothello.GOF23.builder;

public class YPWAirshipDirector implements AirShipDirector {
    @Override
    public AirShip directAirShip(AirShipBuilder airShipBuilder) {
        Engine e = airShipBuilder.buildEngine();
        OrbitalModule o = airShipBuilder.buildOrbitalModule();
        EscapeTower et = airShipBuilder.buildEscapeTower();

        //装配成飞船对象
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(et);
        ship.setOrbitalModule(o);

        return ship;
    }
}
