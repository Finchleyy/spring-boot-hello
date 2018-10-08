package com.ypw.springboothello.GOF23.prototype;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Date;

public class Client3 {
    @Test
    public void testClone() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        SheepParam jam = new SheepParam("Jam");
        Sheep sheep = new Sheep("原型", new Date(),jam);
        System.out.println(sheep);
        System.out.println(sheep.getSname());
        System.out.println(sheep.getBirthday());
        System.out.println(sheep.getSheepParam().getName());
        //使用序列化克隆对象(深复制)
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(sheep);
        byte[] bytes = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Sheep clone = (Sheep) objectInputStream.readObject();
        /*Sheep clone = (Sheep) sheep.clone();*/
        clone.setSname("克隆体");
        System.out.println(clone);
        System.out.println(clone.getSname());

        jam.setName("66666666");
        System.out.println(clone.getSheepParam().getName());
        sheep.setBirthday(new Date(456789789L));
        //System.out.println(sheep.getBirthday());
        System.out.println(clone.getBirthday());

    }
}
