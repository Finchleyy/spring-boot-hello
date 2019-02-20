package com.ypw.innerClass;

/**
 * @ClassName InerClass
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/2 16:26
 * @Version 1.0
 **/
public class InerClass {
    //静态内部类
    private static class StaticClass {

    }

    //普通内部类
    private class FiledInnerClass {

    }

    void sayHello() {
        //方法内部类(局部内部类)
        class LocalClass {

        }
    }

    //匿名内部类
    Runnable runnable = new Runnable() {//定义了匿名内部类的类体;创建了一个匿名内部类的实例
        @Override
        public void run() {
            String s = "" + "666";
        }
    };

    InterfaceDemo1 interfaceDemo1 = new InterfaceDemo1() {
        @Override
        public void innerMethod() {


        }
    };
}
