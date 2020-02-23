package com.wd.sort;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {1,22,44,33,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        int temp = 0;
        for(int i=0;i<arr.length;){
            for(int j=1;j<arr.length-i;j++){
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                i++;
            }
        }
    }
}
