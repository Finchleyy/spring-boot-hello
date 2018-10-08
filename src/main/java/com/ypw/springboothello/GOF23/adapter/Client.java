package com.ypw.springboothello.GOF23.adapter;

import org.junit.jupiter.api.Test;

/**
 *
 * 客户端
 * @author yupengwu
 * @date 2018/10/8 14:22
 * @param
 * @return
 */
public class Client {
    public void test1(Target target){
        target.handleReq();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter();

        Target target2 = new Adapter2(adaptee);
        client.test1(target2);
    }
}
