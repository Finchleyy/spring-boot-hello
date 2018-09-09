package com.ypw.reflection;

/**
 * @ClassName Bean
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/9 16:00
 * @Version 1.0
 **/
public class Bean {
    private String name;
    private String age;
    public void testMethod(){
        System.out.println("test Method Invoke....");
    }

    public Bean() {
    }

    public Bean(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
