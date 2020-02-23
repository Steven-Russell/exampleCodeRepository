package com.wd.map;

import java.util.HashMap;

/**
 * @author StevenRussell
 * @date 2020/2/23 16:30
 **/
public class HashMapResearch {
    /**
     * 底层结构：数组+单向链表（红黑树）--在链表长度大于8的时候，将后面的数据存在二叉树中
     * 初始化长度: 数组长度在第一次进行put操作之后变成16
     * 扩容时机：默认达到75%容量时则会进行扩容
     * 每次扩容大小：变成原数组的两倍
     */

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Steven","Russell");
    }
}
