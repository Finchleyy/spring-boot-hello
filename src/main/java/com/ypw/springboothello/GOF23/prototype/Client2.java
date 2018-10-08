package com.ypw.springboothello.GOF23.prototype;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class Client2 {
    @Test
    public void testClone() throws CloneNotSupportedException {
        SheepParam jam = new SheepParam("Jam");
        SheepDeep sheep = new SheepDeep("原型", new Date(), jam);
        System.out.println(sheep);
        System.out.println(sheep.getSname());
        System.out.println(sheep.getBirthday());
        System.out.println(sheep.getSheepParam().getName());

        SheepDeep clone = (SheepDeep) sheep.clone();
        clone.setSname("克隆体");
        System.out.println(clone);
        System.out.println(clone.getSname());
        /*深拷贝是一个整个独立的对象拷贝，深拷贝会拷贝所有的属性,并拷贝属性指向的动态分配的内存。
        当对象和它所引用的对象一起拷贝时即发生深拷贝。深拷贝相比于浅拷贝速度较慢并且花销较大。

        简而言之，深拷贝把要复制的对象所引用的对象都复制了一遍。
        */
        jam.setName("66666666");
        System.out.println(clone.getSheepParam().getName());
        sheep.setBirthday(new Date(456789789L));
        //System.out.println(sheep.getBirthday());
        System.out.println(clone.getBirthday());

    }
}
