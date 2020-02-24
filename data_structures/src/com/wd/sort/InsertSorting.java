package com.wd.sort;

import java.util.Arrays;

/**
 * @author StevenRussell
 * @date 2020/2/23 17:52
 **/
public class InsertSorting {
    public static void main(String[] args) {
        int[] arr = {-1, 22, 44, 33, -5,-10};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        int temp = 0;//作为交换时的中间变量
        for (int i = 0; i < arr.length-1; i++) {
            int m = 0;
            //逐步向前进行交换
            while (( i - m >= 0)&&(arr[i + 1 - m] < arr[i - m])) {
                temp = arr[i  - m];
                arr[i - m] = arr[i + 1 - m];
                arr[i + 1 - m] = temp;
                m++;
            }
        }
    }

}
