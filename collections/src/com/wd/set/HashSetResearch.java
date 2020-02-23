package com.wd.set;

import java.util.HashSet;

/**
 * @author StevenRussell
 * @date 2020/2/23 17:00
 **/
public class HashSetResearch {
    /**
     * 底层结构：底层就是hashmap,只是默认所有的键值都是 private static final Object PRESENT = new Object();
     * 初始化长度:
     * 扩容时机：
     * 每次扩容大小：
     */

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Steven");
    }
}
