package com.ypw.thread;

import java.util.Objects;

/**
 * @ClassName main
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/2 13:53
 * @Version 1.0
 **/
public class main {
    public static void main(String[] args) {
       /* new task1().start();
        new task2().start();*/
        new Thread(new Task11()).start();
        new Thread(new Task22()).start();
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
            System.out.println(i);
            }
        }).start();

    }
}
