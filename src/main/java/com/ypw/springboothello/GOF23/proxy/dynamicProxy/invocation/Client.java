package com.ypw.springboothello.GOF23.proxy.dynamicProxy.invocation;

import java.lang.reflect.Proxy;

/**
 * JDK方式实现动态代理(效率比较低,被代理对象需要实现接口(传递接口实现动态代理))
 *
 * @param
 * @author yupengwu
 * @date 2018/10/10 09:55
 * @return
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        RealStar realStar = new RealStar();
        StarHandler starHandler = new StarHandler(realStar);
        /*String[] strings = new String[]{"www","."};*/
        System.out.println(Client.class.getClassLoader());
        //第一个参数:反射时使用的类加载器
        //第二个参数:代理对象需要实现什么接口
        //第三个参数:通过接口调用方法时,具体实现类的invoke方法
        Star proxyInstance = (Star) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{Star.class}, starHandler);
        proxyInstance.sing();
        proxyInstance.bookTicket();
        System.out.println(proxyInstance.collectMoney());
    }
}
