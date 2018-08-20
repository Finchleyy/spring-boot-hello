package com.ypw.linkedList;

import java.util.LinkedList;

/**
 * @ClassName TestLinkedList
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/14 10:45
 * @Version 1.0
 **/
public class TestLinkedList {
    public static void main(String[] args) {
        /*LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.set(1, "3");
        stringLinkedList.add(2, "5");
        System.out.println(stringLinkedList.toString());*/
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("123");
        myLinkedList.add("456");
        Object o = myLinkedList.get("789");
        System.out.println(o);
    }
}
