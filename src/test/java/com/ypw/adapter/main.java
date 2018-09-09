package com.ypw.adapter;

/**
 * @ClassName main
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/6 21:31
 * @Version 1.0
 **/
public class main {
    public static void main(String[] args) {
        //使用匿名内部类需要实现所有的接口
       /* new Adapter().adapter(new Listener() {
            @Override
            public void interface1() {

            }

            @Override
            public void interface2() {

            }
        });*/

       //使用适配器可以选择要重写的接口(adapter抽象类中已经有了所有的空实现)
        new Adapter().adapter(new ListernerAdapter() {
            @Override
            public void interface1() {
                super.interface1();
            }
        });
    }
}
