package com.ypw.springboothello.GOF23.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        RealStar realStar = new RealStar();
        StarHandler starHandler = new StarHandler(realStar);
        /*String[] strings = new String[]{"www","."};*/
        Star proxyInstance = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);
        proxyInstance.sing();
        proxyInstance.bookTicket();
    }
}
