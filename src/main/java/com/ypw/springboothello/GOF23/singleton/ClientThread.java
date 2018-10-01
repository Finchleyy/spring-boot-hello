package com.ypw.springboothello.GOF23.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 多线程测试环境
 * countdownLaunch
 *
 * @param
 * @author yupengwu
 * @date 2018/10/1 15:26
 * @return
 */
public class ClientThread {
    public static void main(String[] args) throws InterruptedException {
        int threadCount = 10;
        long start = System.currentTimeMillis();

        //1000个线程
        final CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        for (int i = 0; i < threadCount; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    //在创建对象之前先阻塞,等到countdownlaunch计数完毕,并发!
                    try {
                        //System.out.println(Thread.currentThread().getName());
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < 10000000; i++) {
                        //静态内部类
                        //Singleton01 singleton01 = Singleton01.getSingleton01();
                        //饿汉式
                        //Singleton02 instance = Singleton02.getInstance();
                        //懒汉式
                        Singleton03 instance = Singleton03.getInstance();
                        //枚举
                        //Singleton04 instance = Singleton04.INSTANCE;
                        //System.out.println(instance);
                    }
                }
            }).start();
            //计数减1,减完唤醒全部线程
            countDownLatch.countDown();

        }
        //countDownLatch.await();//阻塞main线程.直到所有线程执行完毕
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
