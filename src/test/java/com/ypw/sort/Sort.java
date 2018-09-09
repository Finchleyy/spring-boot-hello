package com.ypw.sort;

/**
 * @ClassName Sort
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/1 15:26
 * @Version 1.0
 **/
public class Sort {
    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 4, 5, 6, 1, 1, 32, 19};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int temp = arr[j];
                if (temp > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ",");
        }
    }
}
