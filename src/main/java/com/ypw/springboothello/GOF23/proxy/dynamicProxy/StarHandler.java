package com.ypw.springboothello.GOF23.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类前置处理.........");
        if(method.getName().equals("sing")){
            System.out.println("捕捉到sing方法!~!~!");
        }
        method.invoke(realStar, args);
        System.out.println("代理类后置处理.........");
        return null;
    }
}
