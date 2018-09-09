package com.ypw.reflection;

/**
 * @ClassName Demo01
 * @Description 获取类的反射的方法
 * @Author yupengwu
 * @Date 2018/9/9 16:00
 * @Version 1.0
 **/
public class Demo01 {
    public static void main(String[] args) {
        String path = "com.ypw.reflection.Bean";
        try {
            //1
            Class<?> clazz = Class.forName(path);
            //2
            Class<Bean> beanClass = Bean.class;
            System.out.println(clazz == beanClass);
            //3
            Bean bean = new Bean();
            Class<? extends Bean> beanClass1 = bean.getClass();
            System.out.println(beanClass1 == clazz);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
