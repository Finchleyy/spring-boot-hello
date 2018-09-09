package com.ypw.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @ClassName APP
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/9 15:20
 * @Version 1.0
 **/
public class APP {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.ypw.annotation.Student");
            //获取类的所有注解
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
            //根据指定类获取单个注解
            TableAnnotation annotation = clazz.getAnnotation(TableAnnotation.class);
            System.out.println(annotation.value());
            //获取类的属性注解
            /*Field studentName = clazz.getDeclaredField("studentName");
            FieldAnnotation studentNameAnnotation = studentName.getAnnotation(FieldAnnotation.class);
            System.out.println(studentNameAnnotation.columnName()+"||"+studentNameAnnotation.type());*/

            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field field : declaredFields) {
                FieldAnnotation fieldAnnotation = field.getAnnotation(FieldAnnotation.class);
                System.out.println(fieldAnnotation.columnName() + "||" + fieldAnnotation.type());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
