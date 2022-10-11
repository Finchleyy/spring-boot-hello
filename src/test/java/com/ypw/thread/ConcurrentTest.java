package com.ypw.thread;

import com.ypw.practise.single.SingleStaticClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentTest {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            MyTask myTask = new MyTask();
            executorService.execute(myTask);
        }
    }

    public static class MyTask implements Runnable {

        /**
         * When an object implementing interface <code>Runnable</code> is used
         * to create a thread, starting the thread causes the object's
         * <code>run</code> method to be called in that separately executing
         * thread.
         * <p>
         * The general contract of the method <code>run</code> is that it may
         * take any action whatsoever.
         *
         * @see Thread#run()
         */
        @Override
        public void run() {
            SingleStaticClass singleStaticInstance = SingleStaticClass.getSingleStaticInstance();
            System.out.println(singleStaticInstance);
        }
    }
}
