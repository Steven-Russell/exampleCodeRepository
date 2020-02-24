package com.wd.sort;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {1,22,44,33,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        boolean flag; //如果在进行一次循环之后并没有发生交换，则直接退出
        int temp = 0;//作为交换时的临时变量
        for(int i=0;i<arr.length-1;i++){
            flag = true;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){ //相邻的数顺序个目标顺序相反则进行交换
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = false;
                }

            }
            if(flag){
                break;
            }
        }
    }
}
