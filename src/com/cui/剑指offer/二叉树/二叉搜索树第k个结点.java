package com.cui.剑指offer.二叉树;


import java.util.Stack;

/**
 * 二叉搜索树的中序遍历就是排好序的
 * 找第k个结点，遍历时判断是否是第k个
 */
public class 二叉搜索树第k个结点 {

    /**
     * 递归方式
     */
    static int count=0;
    public static TreeNode KthNode(TreeNode pRoot, int k){

        if(pRoot != null) {
            TreeNode leftNode = KthNode(pRoot.left, k);
            if(leftNode != null)
                return leftNode;
            count++;
            if(count == k)
                return pRoot;
            TreeNode rightNode = KthNode(pRoot.right, k);
            if(rightNode != null)
                return rightNode;
        }
        return null;
    }

    /**
     * 非递归（栈）
     */
    public static TreeNode KthNode2(TreeNode pRoot, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(pRoot==null||k==0) return null;
        int t=0;
        while(pRoot!=null ||stack.size()>0){
            while(pRoot!=null){
                stack.push(pRoot);
                pRoot = pRoot.left;
            }
            if(stack.size()>0){
                pRoot= stack.pop();
                t++;
                if(t==k) return pRoot;
                pRoot= pRoot.right;
            }
        }
        return null;
    }
}
class TreeNode{
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int data) {
        this(data,null,null);
    }
}

