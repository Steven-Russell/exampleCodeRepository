package com.wd.code;

/**
 * @author StevenRussell
 * @date 2020/3/19 10:37
 **/
public class NumberOf1 {
    public int NumberOf1(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
