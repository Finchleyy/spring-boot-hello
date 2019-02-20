package com.ypw.mapTest;

import com.ypw.linkedList.MyLinkedList;

/**
 * @ClassName MyMap
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/15 14:17
 * @Version 1.0
 **/
public class MyMap {
    //数组里面放链表(链表数组)
    MyLinkedList[] myEntries = new MyLinkedList[999];
    int size;

    public void put(Object key, Object value) {
        MyEntry myEntry = new MyEntry(key, value);
        int hash = key.hashCode() % 999;
        if (myEntries[hash] == null) {
            MyLinkedList myLinkedListTemp = new MyLinkedList();
            myLinkedListTemp.add(myEntry);
            myEntries[hash] = myLinkedListTemp;
        } else {
            MyLinkedList myLinkedListTemp = myEntries[hash];
            for (int i = 0; i < myLinkedListTemp.size(); i++) {
                MyEntry myEntry1 = (MyEntry) myLinkedListTemp.get(i);
                if (myEntry1.key.equals(key)) {
                    myEntry1.setValue(value);//添加时判定key重复,直接覆盖value
                }
            }
            myEntries[hash].add(myEntry);

        }
    }

    public Object get(Object key) {
        int hash = key.hashCode() % 999;
        if (myEntries[hash] == null) {
            return null;
        } else {
            MyLinkedList myLinkedListTemp = myEntries[hash];
            for (int i = 0; i < myLinkedListTemp.size(); i++) {
                MyEntry myEntry = (MyEntry) myLinkedListTemp.get(i);
                if (myEntry.key.equals(key)) {
                    return myEntry.value;
                }
            }
        }
        return null;
    }
}
