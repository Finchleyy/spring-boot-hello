package com.ypw;

/**
 * @ClassName Test
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/3 17:39
 * @Version 1.0
 **/
public class Test {

    @org.junit.Test
    public void test() {
        int i = 1;
        i = i++;
        System.out.println(i);
        int j = 1;
        j = ++j;
        System.out.println(j);
    }
    public int testMethod() {
        int i = 666;
        int j = 888;
        int sum = i + j;
        String s = "aaaa";
        return sum;
    }
}
