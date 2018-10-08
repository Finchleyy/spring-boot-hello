package com.ypw.springboothello.GOF23.adapter;
/**
 *
 * 适配器(使用组合类方式跟被适配对象)
 * @author yupengwu
 * @date 2018/10/8 14:58
 * @param
 * @return
 */
public class Adapter2 implements Target{
    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}
