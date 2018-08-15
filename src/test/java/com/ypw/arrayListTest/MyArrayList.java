package com.ypw.arrayListTest;

import java.util.Arrays;

/**
 * @ClassName MyArrayList
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/6 13:53
 * @Version 1.0
 **/
public class MyArrayList {
    private Object[] elementData;
    private int size;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int initialSize) {
        super();
        if (initialSize < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialSize);
        } else {
            this.elementData = new Object[initialSize];
        }
    }

    public void add(Object object) {
        if (size + 1 > elementData.length) {
            Object[] newElementDate = new Object[size * 2 + 1];
            newElementDate = Arrays.copyOf(elementData, newElementDate.length);
            elementData = newElementDate;
        }
        elementData[size++] = object;
    }

    public Object get(int index) {
        if (index < size && index > 0) {
            return elementData[index];
        } else {
            return null;
        }
    }
}
