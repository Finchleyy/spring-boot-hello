package com.ypw.GOF.factory;

/**
 * @ClassName Singleton
 * @Description 单例懒汉式
 * @Author yupengwu
 * @Date 2018/9/6 14:15
 * @Version 1.0
 **/
public class SingletonLazy {
    private static SingletonLazy singletonLazy;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            synchronized (SingletonLazy.class) {
                if (singletonLazy == null) {
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }
}
