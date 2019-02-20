package com.ypw.arrayListTest;


import com.ypw.linkedList.MyLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        //System.out.println(myArrayList.get(2));


        List listDelete = new ArrayList();
        listDelete.add("111");
        listDelete.add("222");
        listDelete.add("333");
        for (int i = 0; i < listDelete.size(); i++) {
            System.out.println(listDelete.get(i));
        }
        /*boolean remove = listDelete.remove(listDelete.get(1));
        for (int i = 0; i < listDelete.size(); i++) {
            System.out.println(listDelete.get(i));
        }*/
        Iterator iterator = listDelete.iterator();
        while (iterator.hasNext()) {
            String next = (String) iterator.next();
            if ("111".equals(next)) {
                iterator.remove();
            }
        }
        for (int i = 0; i < listDelete.size(); i++) {
            System.out.println(listDelete.get(i));
        }

    }
}
