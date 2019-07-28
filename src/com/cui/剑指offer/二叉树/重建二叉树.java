package com.cui.剑指offer.二叉树;

import java.util.Arrays;

public class 重建二叉树 {
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null) {
            return null;
        }
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        if (pre.length != in.length) {
            return null;
        }

        /**
         * 1.根据前序遍历的第一个数字创建根节点
         * 2.在中序遍历中找到根节点的位置，确定左右子树节点的数量
         * 3.递归调用，创建左右子树
         *
         */
        TreeNode root = new TreeNode(pre[0]);//第一个
        for (int i = 0; i < in.length; i++) {
            if (pre[0] == in[i]) {
                //pre的0往后数i个是左子树的，copyofrange包含前面的下标，不包含后面的下标
                //in的i往前数i个是左子树的。
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                //注意in是从i+1开始，因为i是现在的根，i+1开始才是右子树
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length),
                        Arrays.copyOfRange(in, i + 1, in.length));
            }
        }
        return root;
    }

}
