package com.ypw.valueTest;


/**
 * @ClassName ValueTest
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/6 17:06
 * @Version 1.0
 **/
public class ValueTest {
    public static void main(String[] args) {
        System.out.println(2.0/0);
        int a = 788_909_00;
        System.out.println(a);

        byte by = 97;
        char ch = (char) by;
        System.out.println(ch);
    }
}
