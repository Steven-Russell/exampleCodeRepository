package com.wd.sort;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * @author StevenRussell
 * @date 2020/2/23 20:11
 **/
public class ShellSorting {
    public static void main(String[] args) {
//        int[] arr = {99,88,77,-1, 22, 44, 33, -5,-10,1};
        int[] arr = new int[800000];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*1000+1);
        }
        long t1 = System.currentTimeMillis();
        shellSort(arr);
        System.out.println(System.currentTimeMillis()-t1);
    }

    private static void shellSort(int[] arr) {
        // 增量gap, 并逐步的缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // 从第gap个元素，逐个对其所在的组进行直接插入排序
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        //移动
                        arr[j] = arr[j-gap];
                        j -= gap;
                    }
                    //当退出while后，就给temp找到插入的位置
                    arr[j] = temp;
                }

            }
        }
    }
}
