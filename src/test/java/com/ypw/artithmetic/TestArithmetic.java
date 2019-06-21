package com.ypw.artithmetic;

import org.junit.Test;

public class TestArithmetic {
    @Test
    public void binaryCount() {
        int input = 55;
        int y = 0;
        //int temp = 0;
        int count = 0;
        while (input >= 1) {
            y = input % 2;
            input = input / 2;
            if (y == 1) {
                ++count;
            }

        }
        System.out.println(count);
    }

    /**
     * @return void
     * @Description //二分查找(必须是有序)
     * @Author yupengwu
     * @Date 2019-02-21 09:32
     * @Param []
     **/
    @Test
    public void binarySearch() {
        int search = 3;
        int[] arr = {1, 3, 6, 8, 9, 11, 33, 34, 56, 77, 88, 99};
        int left = 0;
        int right = arr.length - 1;
        while (right > left) {
            int middle = (left + right) / 2;
            if (arr[middle] == search) {
                System.out.println(middle);
                break;
            } else if (arr[middle] < search) {
                left = middle;
            } else {
                right = middle;
            }
        }
    }

    /**
     * @return
     * @Description //冒泡排序
     * @Author yupengwu
     * @Date 2019-02-21 09:45
     * @Param
     **/
    @Test
    public void sort() {
        int[] arr = {1, 3, 6, 8, 19, 9, 66, 11, 33, 34, 56, 2, 77, 88, 99};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
