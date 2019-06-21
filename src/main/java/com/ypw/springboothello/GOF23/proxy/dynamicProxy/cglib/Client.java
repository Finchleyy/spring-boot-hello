package com.ypw.springboothello.GOF23.proxy.dynamicProxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * cglib实现动态代理(基于字节码,运行效率高)
 *
 * @param
 * @author yupengwu
 * @date 2018/10/10 09:16
 * @return
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealStar.class);
        enhancer.setCallback(new StarHandler());
        RealStar realStar = (RealStar) enhancer.create();
        realStar.bookTicket();
        realStar.sing();
    }
}
