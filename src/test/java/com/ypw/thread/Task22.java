package com.ypw.thread;

/**
 * @ClassName Task22
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/2 14:34
 * @Version 1.0
 **/
public class Task22 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Task22 start........" + i);
        }
    }
}
