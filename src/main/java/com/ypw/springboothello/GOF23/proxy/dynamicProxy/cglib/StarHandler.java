package com.ypw.springboothello.GOF23.proxy.dynamicProxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class StarHandler implements MethodInterceptor {
    //o:生成的子类对象
    //method:被代理的方法
    //objects:被代理的参数
    //methodProxy:生成的代理方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理类前置处理.........");
        if (method.getName().equals("sing")) {
            System.out.println("捕捉到sing方法!~!~!");
        }
        //调用子类重写的方法(被代理对象的方法)
        //Object invoke = method.invoke(o, objects);
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        //下面调用会报错,循环调用,一直在循环调用被代理对象的方法
        //Object invoke1 = methodProxy.invoke(o, objects);
        System.out.println("代理类后置处理.........");
        return invokeSuper;
    }
}
