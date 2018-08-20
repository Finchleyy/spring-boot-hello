package com.ypw.classLoader;

/**
 * @ClassName ClassLoader
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/20 11:10
 * @Version 1.0
 **/
public class ClassLoader {
    public static void main(String[] args) {
        java.lang.ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        while (true) {
            System.out.println(contextClassLoader.getClass().getName());

            contextClassLoader = contextClassLoader.getParent();
            if (contextClassLoader == null) {
                break;
            }
        }
    }
}
