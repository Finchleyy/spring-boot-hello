package com.ypw.stringTest;

/**
 * @ClassName TestString
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/3 10:26
 * @Version 1.0
 **/
public class TestString {
    public static void main(String[] args) throws InterruptedException {
        String a = "a";
        for (int i = 0; i <1000 ; i++) {
            //Thread.sleep(100);
            a = a+i;
            System.out.println(a);
        }
    }
}
