package com.ypw.springboothello.GOF23.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试反射和反序列化破解
 * 懒汉式(虽然经过doublechecked但是因为虚拟机指令重排可能出现线程不安全)
 * instance上使用volatile防止指令重排
 *
 * @param
 * @author yupengwu
 * @date 2018/9/29 15:09
 * @return
 */
public class Singleton06 implements Serializable {
    private static /*volatile*/ Singleton06 instance;
    static {
        b=6;
        System.out.println("静态代码块");
    }

    static int b = 9;
    private Singleton06() {
        System.out.println("调用了无参构造方法");
        //检查如果已经创建了对象就抛出异常,防止反射的newInstance
        /*if(instance!=null){
            throw new RuntimeException();
        }*/
    }

    public static Singleton06 getInstance() {
        if (instance == null) {
            synchronized (Singleton06.class) {
                if (instance == null) {
                    synchronized (Singleton06.class) {
                        instance = new Singleton06();
                    }
                }
            }
        } else {
            return instance;
        }
        return instance;
    }
    //反序列化时，如果定义了readResolve()则直接返回此方法指定的对象。而不需要单独再创建新对象！
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
