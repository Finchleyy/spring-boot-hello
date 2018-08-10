package com.ypw.listTest;

/**
 * @ClassName YPWList
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/8/6 13:53
 * @Version 1.0
 **/
public class YPWList {

    public YPWList() {
        this(10);
    }

    public YPWList(int initialSize) {
        super();
        if (initialSize < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialSize);
        }
    }
}
