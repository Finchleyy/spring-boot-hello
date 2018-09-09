package com.ypw.thread;

/**
 * @ClassName Task11
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/2 14:10
 * @Version 1.0
 **/
public class Task11 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Task11 start........" + i);
        }
    }
}

