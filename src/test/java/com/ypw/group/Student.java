package com.ypw.group;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/6 16:03
 * @Version 1.0
 **/
public class Student {
    private String name;
    private int age;
    private Long hight;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getHight() {
        return hight;
    }

    public void setHight(Long hight) {
        this.hight = hight;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Long getIwantStudent() {
        return Long.valueOf(this.sex + this.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hight=" + hight +
                ", sex=" + sex +
                '}';
    }
}
