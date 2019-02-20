package com.ypw.springboothello.GOF23.singleton;

/**
 * 饿汉式(不存在线程问题)
 *
 * @param
 * @author yupengwu
 * @date 2018/9/29 14:50
 * @return
 */
public class Singleton02 {
    private static final Singleton02 instance = new Singleton02();

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        return instance;
    }
}
