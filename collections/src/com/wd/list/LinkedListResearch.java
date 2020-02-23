package com.wd.list;

import java.util.LinkedList;

/**
 * @author StevenRussell
 * @date 2020/2/23 16:01
 **/
public class LinkedListResearch {
    /**
     * 底层结构：双向链表，默认按照添加顺序排列
     * 初始化长度: 没有初始化长度
     * 扩容时机: 不需要扩容
     * 每次扩容大小：不需要扩容
     */

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("StevenRussell");
        linkedList.addFirst("StevenRussell");
        linkedList.addLast("StevenRussell");
        linkedList.remove(0);//底层分别从一半或者尾部进行遍历找到对应的节点之后，再执行遍历删除该节点
        linkedList.remove();//默认删除链表最后一个节点
        linkedList.set(2, "Steven");
        linkedList.get(2);
        linkedList.getFirst();
        linkedList.getLast();
    }
}
