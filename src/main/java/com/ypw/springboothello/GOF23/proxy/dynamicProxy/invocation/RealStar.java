package com.ypw.springboothello.GOF23.proxy.dynamicProxy.invocation;

public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }

    @Override
    public void sing() {
        System.out.println("RealStar(周杰伦本人).sing()");
    }

    @Override
    public String collectMoney() {
        System.out.println("RealStar.collectMoney()");
        return "收到6666万";
    }
}
