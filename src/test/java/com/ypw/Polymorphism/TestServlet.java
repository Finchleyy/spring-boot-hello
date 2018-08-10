package com.ypw.Polymorphism;

/**
 * @ClassName TestServelet
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/2 14:17
 * @Version 1.0
 **/
public class TestServlet {
    public static void main(String[] args) {
        MyServlet myServlet = new MyServlet();
        myServlet.service();
        myServlet.doGet();
    }
}
