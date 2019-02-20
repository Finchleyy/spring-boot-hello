package com.ypw.springboothello.GOF23.singleton;

/**
 * 静态内部类实现单例
 * 静态内部类实现懒加载,而且是线程安全的,nice
 *
 * @param
 * @author yupengwu
 * @date 2018/9/29 14:39
 * @return
 */
public class Singleton01 {
    private Singleton01() {

    }

    private static class SingletonInstance {
        private static final Singleton01 instance = new Singleton01();
    }

    public static Singleton01 getSingleton01() {
        return SingletonInstance.instance;
    }
}
