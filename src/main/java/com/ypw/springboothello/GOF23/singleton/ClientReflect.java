package com.ypw.springboothello.GOF23.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * 测试反射和反序列化破解单例
 * @author yupengwu
 * @date 2018/9/30 09:58
 * @param
 * @return
 */
public class ClientReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
        //先调用getInstance创建一个实例化对象
        //反射获取的对象不在singleton06的常量池中
        Singleton06 instance = Singleton06.getInstance();
        System.out.println(instance);
        Class<Singleton06> singleton06Class = (Class<Singleton06>) Class.forName("com.ypw.springboothello.GOF23.singleton.Singleton06");
        Constructor<Singleton06> c = singleton06Class.getDeclaredConstructor(null);
        //跳过安全检查
        c.setAccessible(true);
        Singleton06  s3 = c.newInstance();
        Singleton06  s4 = c.newInstance();
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3.b);
        //创建了两个对象(被破解)



        //通过反序列化创建对象
        FileOutputStream fileOutputStream = new FileOutputStream("/cds/instance.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(instance);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("/cds/instance.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Singleton06 singleton06 = (Singleton06) objectInputStream.readObject();
        System.out.println(singleton06);
    }
}
