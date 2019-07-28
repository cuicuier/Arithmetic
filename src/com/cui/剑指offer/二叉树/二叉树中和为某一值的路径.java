package com.cui.剑指offer.二叉树;

import java.util.ArrayList;

public class 二叉树中和为某一值的路径 {


    private static ArrayList<Integer> list =new ArrayList<Integer>();
    private static ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();


    /**
     * 代码步骤：一个链表记录路径，一个存放这个链表的链表记录最终的结果。前序遍历去访问。先访问根，在递归在左右子树找。注意回退
     * 1.首先将根节点放入链表，target减去这个根节点
     * 2.判断是否target同时是叶子节点，如果是就将当前的链表放在结果链表里
     * 3.如果不是，就递归去访问左右子节点。
     * 4.无论是找到没有，都要回退一步、
     *
     */
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null)
            return resultList;
        list.add(root.data);
        target = target - root.data;
        if(target == 0 && root.left == null && root.right == null){//达到target且当前节点是叶子节点
            resultList.add(new ArrayList<Integer>(list));
        }
        else {
            FindPath(root.left, target);
            FindPath(root.right, target);

        }
        // 在返回父节点之前，在路径上删除该结点
        list.remove(list.size()-1);
        return resultList;
    }
}
