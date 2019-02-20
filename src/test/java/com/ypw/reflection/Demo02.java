package com.ypw.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName Demo02
 * @Description 获取属性, 方法, 构造器
 * @Author yupengwu
 * @Date 2018/9/9 16:17
 * @Version 1.0
 **/
public class Demo02 {
    public static void main(String[] args) {
        String path = "com.ypw.reflection.Bean";
        try {
            Class<Bean> clazz = (Class<Bean>) Class.forName(path);
            System.out.println(clazz.getName());
            //获取属性信息
            Field[] fields = clazz.getFields();//只能获取public修饰的属性
            Field[] declaredFields = clazz.getDeclaredFields();//暴力获取所有属性
            //获取方法信息
            Method[] methods = clazz.getMethods();
            Method[] declaredMethods = clazz.getDeclaredMethods();
            Method testMethod = clazz.getDeclaredMethod("testMethod");

            //通过反射获取实例化对象
            Bean bean = clazz.newInstance();//实际是调用了无参构造方法
            System.out.println(bean);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
