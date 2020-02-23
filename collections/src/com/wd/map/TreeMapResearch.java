package com.wd.map;

import java.util.TreeMap;

/**
 * @author StevenRussell
 * @date 2020/2/23 16:47
 **/
public class TreeMapResearch {
    /**
     * 底层结构：红黑树，天然有序
     *
     * static final class Entry<K,V> implements Map.Entry<K,V> {
     * K key;
     * V value;
     * Entry<K,V> left;
     * Entry<K,V> right;
     * Entry<K,V> parent;
     * boolean color = BLACK;
     *
     * 初始化长度: 无
     * 扩容时机：无
     * 每次扩容大小：无
     */

    public static void main(String[] args) {
        TreeMap<String, String> treenMap = new TreeMap<>();

    }
}
