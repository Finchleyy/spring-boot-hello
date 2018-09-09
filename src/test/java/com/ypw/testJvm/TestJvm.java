package com.ypw.testJvm;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @ClassName TestJvm
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/4 15:14
 * @Version 1.0
 **/
public class TestJvm {
    static int i = 0;
    public static void stackOverFlow(){
        System.out.println("==============="+i++);
        if(i<10){
            stackOverFlow();
        }
    }

    public static void main(String[] args) {
        stackOverFlow();
        System.out.println();
    }
}
