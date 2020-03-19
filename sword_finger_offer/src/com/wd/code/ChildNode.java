package com.wd.code;

/**
 * @author StevenRussell
 * @date 2020/3/19 12:43
 **/
public class ChildNode {
    private int num;
    private ChildNode next;

    public ChildNode(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ChildNode getNext() {
        return next;
    }

    public void setNext(ChildNode next) {
        this.next = next;
    }
}
