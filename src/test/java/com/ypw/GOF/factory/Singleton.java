package com.ypw.GOF.factory;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/6 15:41
 * @Version 1.0
 **/
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
