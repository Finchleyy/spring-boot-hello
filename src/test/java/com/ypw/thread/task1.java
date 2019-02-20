package com.ypw.thread;

/**
 * @ClassName task1
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/2 13:47
 * @Version 1.0
 **/
public class task1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Task1 start........" + i);
        }
    }
}
