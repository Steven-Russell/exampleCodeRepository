package com.wd.code;

/**
 * @author StevenRussell
 * @date 2020/3/12 14:41
 * <p>
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 例如,（5，3，7，2，4，6，8）中，按结点数值大小顺序第三小结点的值为4。
 **/
public class KSequence {
    private int index;
    private TreeNode node;

    public TreeNode KthNode(TreeNode pRoot, int k) {
        if(pRoot==null||k==0){
            return null;
        }else{
            solve(pRoot,k);
        }
        return node;
    }

    //进行中序遍历
    public void solve(TreeNode pRoot,int k){
        if(pRoot.left!=null){
            solve(pRoot.left,k);
        }
        index++;
        if(index==k){
            node = pRoot;
        }
        if(pRoot.right!=null){
            solve(pRoot.right,k);
        }
    }
}
