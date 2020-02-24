package com.wd.sort;

import java.util.Arrays;

/**
 * @author StevenRussell
 * @date 2020/2/23 17:38
 **/
public class SelectSorting {
    public static void main(String[] args) {
        int[] arr = {-1, 22, 44, 33, -5,};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        int temp = 0;//作为交换的中间变量
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
