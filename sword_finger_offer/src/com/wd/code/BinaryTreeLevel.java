package com.wd.code;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author StevenRussell
 * @date 2020/3/14 15:26
 * <p>
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 **/
public class BinaryTreeLevel {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        //保存所有的节点
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (pRoot == null) {
            return list;
        }
        //保存每一层的节点
        ArrayList<Integer> nodeList = new ArrayList<>();
        //创建一个队列
        LinkedList<TreeNode> queue = new LinkedList<>();
        //首先加入根节点
        queue.offer(pRoot);
        //统计每一层的节点个数(初始第一层默认为1)
        int count = 1;
        //统计已经遍历过的节点个数
        int end = 0;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            nodeList.add(temp.val);
            end++;
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
            if (end == count) {
                list.add(nodeList);
                nodeList = new ArrayList<Integer>();
                end = 0;
                count = queue.size();
            }
        }
        return list;
    }
}
