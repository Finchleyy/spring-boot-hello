package com.ypw.singletonTest;

import java.util.concurrent.CountDownLatch;

public class TestSingletonThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                MySingleton singleTon = MySingleton.getSingleTon();
                System.out.println(singleTon);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                MySingleton singleTon = MySingleton.getSingleTon();
                System.out.println(singleTon);
            }
        }).start();

        final int countdownlatchSize = 1000;
        CountDownLatch countDownLatch = new CountDownLatch(countdownlatchSize);
        for (int i = 1; i <countdownlatchSize ; i++) {
            new Thread(() -> {
                MyLazySingleton instance = MyLazySingleton.getInstance();
                System.out.println(instance);
            }).start();
            countDownLatch.countDown();
        }
    }
}
