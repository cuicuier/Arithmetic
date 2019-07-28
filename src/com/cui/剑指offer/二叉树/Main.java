package com.cui.剑指offer.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;

import static com.cui.剑指offer.二叉树.二叉搜索树第k个结点.KthNode;
import static com.cui.剑指offer.二叉树.二叉搜索树第k个结点.KthNode2;
import static com.cui.剑指offer.二叉树.二叉树中和为某一值的路径.FindPath;
import static com.cui.剑指offer.二叉树.从上往下打印二叉树.*;
import static com.cui.剑指offer.二叉树.重建二叉树.reConstructBinaryTree;

public class Main {
    public static void main(String[] args) {
        TreeNode n1=new TreeNode(1,null,null);
        TreeNode n2=new TreeNode(4,null,null);
        TreeNode n3=new TreeNode(7,null,null);
        TreeNode n4=new TreeNode(13,null,null);
        TreeNode n5=new TreeNode(6,n2,n3);
        TreeNode n6=new TreeNode(14,n4,null);
        TreeNode n7=new TreeNode(3,n1,n5);
        TreeNode n8=new TreeNode(10,null,n6);
        TreeNode n9=new TreeNode(8,n7,n8);

        System.out.println(KthNode(n9,6).data);
        System.out.println(KthNode2(n9,7).data);



        ArrayList<Integer> layerList=PrintFromTopToBottom(n9);
        System.out.println("从上往下打印二叉树：");
        for (int i=0;i<layerList.size();i++){
            System.out.print(layerList.get(i)+" ");
        }
        System.out.println();



        ArrayList<LinkedList<Integer>> layerListZ=PrintZ2(n9);
        System.out.println("从上往下打印二叉树,按Z字打印：");
        for (int i=0;i<layerListZ.size();i++){
            for (int j=0;j<layerListZ.get(i).size();j++){
                System.out.print(layerListZ.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("重建二叉树：");
        int[] pre=new int[]{1,2,4,7,3,5,6,8};
        int[] in=new int[]{4,7,2,1,5,3,8,6};
        TreeNode root=reConstructBinaryTree(pre,in);
        ArrayList<ArrayList<Integer>> layerListN=Print(root);
        System.out.println("从上往下打印二叉树,按层换行：");
        for (int i=0;i<layerListN.size();i++){
            for (int j=0;j<layerListN.get(i).size();j++){
                System.out.print(layerListN.get(i).get(j)+" ");
            }
            System.out.println();
        }

        System.out.println("打印二叉树中和为某一值的路径：");
        ArrayList<ArrayList<Integer>> paths=FindPath(root,9);
        for (int i=0;i<paths.size();i++){
            for (int j=0;j<paths.get(i).size();j++){
                System.out.print(paths.get(i).get(j)+" ");
            }
            System.out.println();
        }





    }
}
