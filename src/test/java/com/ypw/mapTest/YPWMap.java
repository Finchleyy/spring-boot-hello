package com.ypw.mapTest;

/**
 * @ClassName YPWMap
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/9 16:48
 * @Version 1.0
 **/
public class YPWMap {
    MyEntry[] myEntries = new MyEntry[9999];
    int size;

    public void put(Object key, Object value) {
        MyEntry myEntry = new MyEntry(key, value);
        myEntries[size++] = myEntry;
    }

    public Object get(Object key) {
        for (int i = 0; i < size; i++) {
            if (myEntries[i].key.equals(key)) {
                return myEntries[i].value;
            }
        }
        return null;
    }
}

class MyEntry {
    Object key;
    Object value;

    public MyEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

