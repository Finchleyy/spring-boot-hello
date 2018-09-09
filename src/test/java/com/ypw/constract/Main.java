package com.ypw.constract;

import org.springframework.util.StringUtils;

/**
 * @ClassName Main
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/7 14:44
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("66666");
        System.out.println(student.name);
    }
}
