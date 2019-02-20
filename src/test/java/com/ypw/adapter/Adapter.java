package com.ypw.adapter;

/**
 * @ClassName Adapter
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/6 21:31
 * @Version 1.0
 **/
public class Adapter {
    public void adapter(ListernerAdapter interfaceTest) {
        int bbb = interfaceTest.bbb;
        System.out.println("adapter......." + bbb);
    }

    public void adapter(Listener listener) {
        //int bbb = listener.aaa;
        System.out.println("adapter.......");
    }
}
