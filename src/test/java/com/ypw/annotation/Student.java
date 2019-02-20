package com.ypw.annotation;

/**
 * @ClassName Student
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/9 15:10
 * @Version 1.0
 **/
@TableAnnotation("tb_student")
public class Student {
    @FieldAnnotation(columnName = "id", type = "int", length = 10)
    private String id;
    @FieldAnnotation(columnName = "name", type = "varchar", length = 10)
    private String studentName;
    @FieldAnnotation(columnName = "age", type = "int", length = 10)
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
