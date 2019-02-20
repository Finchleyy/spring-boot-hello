package com.ypw.thread;

/**
 * @ClassName task2
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/2 13:56
 * @Version 1.0
 **/
public class task2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Task2 start==========" + i);
        }
    }
}
