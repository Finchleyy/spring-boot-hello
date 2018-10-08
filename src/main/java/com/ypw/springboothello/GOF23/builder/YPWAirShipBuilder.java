package com.ypw.springboothello.GOF23.builder;

public class YPWAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine buildEngine() {
        System.out.println("构建尚学堂牌发动机！");
        return new Engine("尚学堂牌发动机！");
    }

    @Override
    public EscapeTower buildEscapeTower() {

        System.out.println("构建逃逸塔");
        return new EscapeTower("尚学堂牌逃逸塔");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("尚学堂牌轨道舱");
    }
}
