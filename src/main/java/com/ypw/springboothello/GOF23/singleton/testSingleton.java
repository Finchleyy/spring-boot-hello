package com.ypw.springboothello.GOF23.singleton;

import static sun.jvm.hotspot.runtime.PerfMemory.start;

public class testSingleton {
    public static void main(String[] args) {
        //多线程测试静态内部类单例
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton01 singleton01 = Singleton01.getSingleton01();
                System.out.println(singleton01);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton01 singleton01 = Singleton01.getSingleton01();
                System.out.println(singleton01);
            }
        }).start();
        //多线程测试懒汉式
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton02 singleton02 = Singleton02.getInstance();
                System.out.println(singleton02);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton02 singleton02 = Singleton02.getInstance();
                System.out.println(singleton02);
            }
        }).start();
        //多线程测试懒汉式(doublechecked)
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton03 singleton03 = Singleton03.getInstance();
                System.out.println(singleton03);
            }
        }).start();
        new Thread(() -> {
            Singleton03 singleton03 = Singleton03.getInstance();
            System.out.println(singleton03);
        }).start();
        //测试枚举创建的单例
        Singleton04 instance = Singleton04.INSTANCE;
        Singleton04 instance1 = Singleton04.INSTANCE;
        System.out.println(instance==instance1);
        System.out.println(instance.toString());
        System.out.println(instance1.toString());
    }
}
