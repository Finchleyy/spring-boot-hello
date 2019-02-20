package com.ypw.springboothello.GOF23.prototype;

import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * 原型模式
 *
 * @param
 * @author yupengwu
 * @date 2018/10/8 13:49
 * @return
 */
public class Client {
    @Test
    public void testClone() throws CloneNotSupportedException {
        SheepParam jam = new SheepParam("Jam");
        Sheep sheep = new Sheep("原型", new Date(), jam);
        System.out.println(sheep);
        System.out.println(sheep.getSname());
        System.out.println(sheep.getBirthday());
        System.out.println(sheep.getSheepParam().getName());

        Sheep clone = (Sheep) sheep.clone();
        clone.setSname("克隆体");
        System.out.println(clone);
        System.out.println(clone.getSname());
        /*被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用仍然指向原来的对象。
        即对象的浅拷贝会对“主”对象进行拷贝，但不会复制主对象里面的对象。
        ”里面的对象“会在原来的对象和它的副本之间共享。

        简而言之，浅拷贝仅仅复制所考虑的对象，而不复制它所引用的对象*/
        //普通的复制,重新给源对象set值会影响到克隆的元素,
        jam.setName("66666666");
        System.out.println(clone.getSheepParam().getName());
        sheep.setBirthday(new Date(456789789L));
        //System.out.println(sheep.getBirthday());
        System.out.println(clone.getBirthday());

    }
}
