package com.ypw.listTest;


import com.ypw.linkedList.MyLinkedList;

/**
 * @ClassName TestList
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/6 9:11
 * @Version 1.0
 **/
public class TestList {
    //List list = new ArrayList(20);
    //int i=2;
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("aaaa");

        System.out.println(myLinkedList.get(1));

    }
}
