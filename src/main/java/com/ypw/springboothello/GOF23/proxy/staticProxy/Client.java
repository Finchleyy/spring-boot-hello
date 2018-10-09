package com.ypw.springboothello.GOF23.proxy.staticProxy;

import org.junit.jupiter.api.Test;

public class Client {
    @Test
    public void test(){
        RealStar realStar = new RealStar();
        ProxyStar proxyStar = new ProxyStar(realStar);
        proxyStar.sing();
        proxyStar.collectMoney();

    }
}
