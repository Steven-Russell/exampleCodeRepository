package com.wd.code;

/**
 * @author StevenRussell
 * @date 2020/3/17 15:03
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 **/
public class GetNextNode {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode==null){
            return null;
        }
        //如果所找的节点存在右子树，则返回右子树的最左节点
        if(pNode.right!=null){
            pNode = pNode.right;
            while(pNode.left!=null){
                pNode = pNode.left;
            }
            return pNode;
        }
        //如果所找节点不存在右子树，则返回其父节点的右子树的最左节点
        //如果其父节点没有右子树，则顺次向上继续寻找
        while(pNode.next!=null){
            //父节点的左子节点等于所找节点
            if(pNode.next.left==pNode){
                return pNode.next;
            }
            //继续向上寻找
            pNode = pNode.next;
        }
        return null;
    }
}
