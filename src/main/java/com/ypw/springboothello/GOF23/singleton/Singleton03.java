package com.ypw.springboothello.GOF23.singleton;

/**
 * 懒汉式(虽然经过doublechecked,但是因为虚拟机指令重排可能出现线程不安全)
 * instance上使用volatile防止指令重排
 *
 * @param
 * @author yupengwu
 * @date 2018/9/29 15:09
 * @return
 */
public class Singleton03 {
    private static volatile Singleton03 instance;

    private Singleton03() {
    }

    public static Singleton03 getInstance() {
        if (instance == null) {
            synchronized (Singleton03.class) {
                if (instance == null) {
                    synchronized (Singleton03.class) {
                        instance = new Singleton03();
                    }
                }
            }
        } else {
            return instance;
        }
        return instance;
    }

}
