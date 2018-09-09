package com.ypw.springboothello.designMode.proxy;

import java.text.BreakIterator;

/**
 * @ClassName StaticProxy
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/2 14:38
 * @Version 1.0
 **/
public class StaticProxy {
    public static void main(String[] args) {
        Marry you = new You();
        proxy proxy = new proxy(you);
        proxy.marry();
    }
}
//共同的接口
interface Marry {
    public abstract void marry();
}
//真实角色
class You implements Marry {

    @Override
    public void marry() {
        System.out.println("you marry");
    }
}
//代理角色
class proxy implements Marry{
    private Marry you;

    public proxy(Marry you) {
        this.you = you;
    }
    public void before(){
        System.out.println("before.....");
    }
    public void after(){
        System.out.println("after.....");
    }
    @Override
    public void marry() {
        before();
        you.marry();
        after();
    }
}