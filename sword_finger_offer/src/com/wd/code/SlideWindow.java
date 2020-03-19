package com.wd.code;

import java.util.ArrayList;

/**
 * @author StevenRussell
 * @date 2020/3/11 22:24
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，
 * 他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
 * {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 **/
public class SlideWindow {

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if(size!=0){
            //分别求出最大值并保存
            int[] temp = new int[size];
            for(int i = 0;i<num.length+1-size;i++){
                System.arraycopy(num,i,temp,0,size);
                list.add(getMax(temp));
            }
        }
        return list;
    }
    //求解最大值
    public static int getMax(int[] window){
        int max =window[0];
        for(int i = 1;i<window.length;i++){
            if(window[i]>max){
                max = window[i];
            }
        }
        return max;
    }
}
