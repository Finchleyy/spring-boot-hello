package com.ypw.GOF.factory;

/**
 * @ClassName main
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/6 14:21
 * @Version 1.0
 **/
public class main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton.getInstance());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton.getInstance());
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton.getInstance());
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
