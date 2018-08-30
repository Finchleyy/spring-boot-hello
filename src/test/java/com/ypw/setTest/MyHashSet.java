package com.ypw.setTest;

import java.util.HashMap;

/**
 * @ClassName MyHashSet
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/30 11:09
 * @Version 1.0
 **/
public class MyHashSet {
    HashMap hashMap;
    private static final Object PRESENT = new Object();

    public MyHashSet() {
        this.hashMap = new HashMap();
    }

    public void add(Object c) {
        hashMap.put(c, PRESENT);//set的不可重复就是利用了map的key不可重复^_^
    }
}
