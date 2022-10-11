package com.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest  {
    private Integer count = 0;
    Lock lock = new ReentrantLock();

    public void add() {
        try {
            //lock.lock();
            count = count + 1;
            //Thread.sleep(10);
            System.out.println(Thread.currentThread().getName() + "================>" + count);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //lock.unlock();
        }
    }

    @Test
    void lockTest() {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    add();
                }
            }).start();
        }
        if (Thread.activeCount() > 2) {
            Thread.yield();
        }
    }
}
