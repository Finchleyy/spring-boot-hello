package com.ypw.Polymorphism;

/**
 * @ClassName HttpServerlet
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/2 14:14
 * @Version 1.0
 **/
public class HttpServlet {
    public void service(){
        System.out.println("serveletService");
        doGet();
    }
    public void doGet(){
        System.out.println("serveletDoGet");
    }
}
