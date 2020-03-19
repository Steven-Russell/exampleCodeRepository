package com.wd.code;

/**
 * @author StevenRussell
 * @date 2020/3/18 9:47
 * <p>
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。n<=39
 **/
public class Fibonacci {
    public int Fibonacci(int n) {
        if(n<0||n>39){
            return -1;
        }
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int[] fibArr = new int[n+1];
        fibArr[0]= 0;
        fibArr[1] =1;

        for(int i = 2;i<fibArr.length;i++){
            fibArr[i] = fibArr[i-1]+fibArr[i-2];
            if(i==n){
                return fibArr[i];
            }
        }
        return -1;
    }
}
