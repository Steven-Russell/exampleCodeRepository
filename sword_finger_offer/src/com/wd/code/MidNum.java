package com.wd.code;

import java.util.PriorityQueue;

/**
 * @author StevenRussell
 * @date 2020/3/11 22:40
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 **/
public class MidNum {
    //大顶堆
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> (o2 - o1));
    //小顶堆
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    //记录插入数据个数
    private int count;

    //左侧为大顶堆，右侧为小顶堆，那么则可以通过大顶堆的值和小顶堆的根节点的值获取到中位数
    //插入数据
    public void Insert(Integer num) {
        //如果为偶数个，则先插入大顶堆，再将大顶堆的根节点插入小顶堆
        if (count % 2 == 0) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        } else { //如果为奇数个数，则先插入小顶堆，然后将小顶堆的根节点插入大顶堆
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
        count++;
    }

    //读取中位数
    public Double GetMedian() {
        if(count%2 ==0){
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }else{
            return Double.valueOf(minHeap.peek());
        }
    }
}
