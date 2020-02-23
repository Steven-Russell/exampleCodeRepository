package com.wd.list;

import java.util.ArrayList;

/**
 * @author StevenRussell
 * @date 2020/2/23 16:02
 **/
public class ArrayListResearch {
    /**
     * 底层结构：Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
     * 初始化长度: DEFAULT_CAPACITY = 10;   也可直接指定长度
     * 扩容时机: 当原来的容量不足的时候 if (minCapacity - elementData.length > 0)   grow(minCapacity);
     * 每次扩容大小：每次扩容1.5倍  newCapacity = oldCapacity + (oldCapacity >> 1);
     */

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("StevenRussell");
        arrayList.remove("StevenRussell");
        arrayList.set(0, "qwer");
        arrayList.get(0);

    }
}
