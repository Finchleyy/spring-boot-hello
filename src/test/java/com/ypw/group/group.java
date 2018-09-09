package com.ypw.group;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @ClassName group
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/6 16:02
 * @Version 1.0
 **/
public class group {
    public static void main(String[] args) {
        List<Student> allList = new ArrayList<>();
        //添加集合信息 省去。。。
        Student st1 = new Student();
        st1.setAge(20);
        st1.setHight(178L);
        st1.setSex(1);
        st1.setName("韩梅梅");
        allList.add(st1);
        Student st11 = new Student();
        st11.setAge(20);
        st11.setHight(168L);
        st11.setSex(1);
        st11.setName("马冬梅");
        allList.add(st11);

        Student st2 = new Student();
        st2.setAge(21);
        st2.setHight(179L);
        st2.setSex(2);
        st2.setName("李磊");
        allList.add(st2);
        Student st22 = new Student();
        st22.setAge(21);
        st22.setHight(189L);
        st22.setSex(2);
        st22.setName("小李");
        allList.add(st22);

        // 以年龄 和 性别 分组，并选取最高身高的 学生
        Map<Long, Optional<Student>> allMapTask = allList.stream().collect(
                Collectors.groupingBy(Student::getIwantStudent, Collectors.maxBy((o1, o2) -> o1.getHight().compareTo(o2.getHight()))));

        // 遍历获取对象信息
        for (Map.Entry<Long,Optional<Student>> entry: allMapTask.entrySet()) {
            Student student = entry.getValue().get();
            System.out.println(student.toString());
        }
    }
}
