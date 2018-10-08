package com.ypw.springboothello.GOF23.adapter;
/**
 *
 * 适配器
 * @author yupengwu
 * @date 2018/10/8 14:24
 * @param
 * @return
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void handleReq() {
        super.request();
    }
}
