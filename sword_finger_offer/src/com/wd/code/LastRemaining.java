package com.wd.code;

import java.util.LinkedList;

/**
 * @author StevenRussell
 * @date 2020/3/19 12:33
 * <p>
 * 每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。
 * HF作为牛客的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:
 * 首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
 * 每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
 * 从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,
 * 并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？
 * (注：小朋友的编号是从0到n-1)
 * <p>
 * 如果没有小朋友，请返回-1
 **/
public class LastRemaining {
    //使用链表进行求解
    //    public int LastRemaining_Solution(int n, int m) {
//        if (n <= 0) {
//            return -1;
//        }
//        m =m-1;
//        LinkedList<ChildNode> list = new LinkedList<>();
//        //初始化环形链表
//        ChildNode first = new ChildNode(0);
//        list.add(first);
//        for(int i=1;i<n;i++){
//            ChildNode childNode = new ChildNode(i);
//            list.get(i-1).setNext(childNode);
//            list.add(childNode);
//        }
//        list.get(n-1).setNext(list.getFirst());
//
//        //开始报数
//        int count = 0;
//        //当前报数人
//        ChildNode curNode = list.get(count);
//        //前一个报数人
//        ChildNode preNode = list.get(count);
//        while(list.size()!=1){
//             while(count<m-1){
//                 count++;
//                 preNode = preNode.getNext();
//                 curNode = curNode.getNext();
//             }
//             curNode = curNode.getNext();
//             preNode.setNext(curNode.getNext());
//             list.remove(curNode);
//             curNode = curNode.getNext();
//             preNode = curNode;
//             count =0;
//        }
//
//        return list.remove().getNum();
//    }
    //使用数组进行求解
    public int LastRemaining_Solution(int n, int m) {
        if (n <= 0) {
            return -1;
        }
        int[] childArr = new int[n];
        //统计还剩多少个
        int end = n;
        //统计当前已经遍历了多少
        int count = 0;
        //当前元素
        int cur = -1;
        while (end > 0) {
            cur++;
            if (cur == n) {
                cur = 0;
            }
            if (childArr[cur] != 0) {
                continue;//说明当前已经被访问过了，直接跳过当前元素
            }
            count++;
            if (count == m ) {
                childArr[cur] = 1;//置为已经访问过
                end--;
                count =0;
            }
        }

        return cur;
    }

    public static void main(String[] args) {
        System.out.println(new LastRemaining().LastRemaining_Solution(5,3));
    }
}
