package com.wd.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author StevenRussell
 * @date 2020/3/17 11:06
 **/
public class BinarytreeLevelReverse {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (pRoot == null) {
            return list;
        }
        //分别保存每一层的节点值
        LinkedList<TreeNode> queue = new LinkedList<>();
        //保存遍历每一层的节点值
        ArrayList<Integer> nodeList = new ArrayList<>();
        //遍历节点
        //保存遍历层数(初始为第一层)
        queue.offer(pRoot);
        int level = 1;
        int start = 0;
        int end = 1;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.remove();
            nodeList.add(temp.val);
            start++;
            if(temp.left!= null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
            if(start==end){
                if (level % 2 ==0 ){
                    Collections.reverse(nodeList);
                }
                list.add(nodeList);
                end = queue.size();
                nodeList = new ArrayList<>();
                start = 0;
                level++;
            }
        }
        return list;
    }

}
