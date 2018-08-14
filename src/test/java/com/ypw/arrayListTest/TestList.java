package com.ypw.arrayListTest;


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
        /*MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add("aaaa");

        System.out.println(myLinkedList.get(1));*/

        MyArrayList myArrayList = new MyArrayList(2);
        myArrayList.add("1111");
        myArrayList.add("222");
        myArrayList.add("3333");
        System.out.println(myArrayList.get(2));

    }
}
