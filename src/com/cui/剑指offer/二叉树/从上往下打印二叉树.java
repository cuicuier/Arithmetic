package com.cui.剑指offer.二叉树;

import java.util.*;


public class 从上往下打印二叉树 {


    /**
     * 从上到下，从左到右打印
     * 1.根节点放到队列里面，队列不空，就打印队列头，打印这个节点，马上把这个节点的左右子节点放到队列中。
     * 2.再要访问一个节点，把这个节点的左右放入，此时队头是同层的，队尾是打印出来的左右。依次先入先出就可以得到结果。
     */
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> layerList = new ArrayList<Integer>();
        if (root == null)
            return layerList;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); //poll()检索并删除列表头结点
            layerList.add(node.data);
            if (node.left != null)
                queue.addLast(node.left); //addLast()将指定元素加到列表尾部
            if (node.right != null)
                queue.addLast(node.right);
        }
        return layerList;
    }

    /**
     * 按层打印，即每一层打印在一行（换行）
     * last:正在打印的当前行的最右结点
     * nlast:下一行的最右结点（遍历子节点时，改变nlast）
     */
    public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode last = pRoot;
        TreeNode nlast =null;
        queue.offer(pRoot); //将指定元素加到列表尾部
        ArrayList<Integer> tmp = new ArrayList<>();//临时记录该层的元素
        while (!queue.isEmpty()) {
            pRoot = queue.poll();
            tmp.add(pRoot.data);//出队列，就把他左右孩子入队列，
            //此时，下一层的最右要跟着更新
            if (pRoot.left!=null) {
                queue.offer(pRoot.left);
                nlast = pRoot.left;
            }
            if (pRoot.right!=null) {
                queue.offer(pRoot.right);
                nlast = pRoot.right;
            }
            //如果到了本层的最右，就把这一层结果放入。

            if (pRoot == last) {
                res.add(new ArrayList<>(tmp));
                last = nlast;
                tmp.clear();
            }
        }
//        res.add(new ArrayList<>(tmp));
        return res;
    }

    /**
     * 请实现一个函数按照之字形打印二叉树，
     * 即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
     */
    /**
     * 利用两个栈的辅助空间分别存储奇数偶数层的节点，然后打印输出。
     */
    public static ArrayList<ArrayList<Integer> > PrintZ(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null)
            return res;
        Stack<TreeNode> s1 = new Stack<>(); //存储奇数层
        Stack<TreeNode> s2 = new Stack<>(); //存储偶数层
        s1.push(pRoot);
        int level = 1;
        while (!s1.empty()||!s2.empty()) {
            if (level %2 != 0) {//奇数层，下一层为偶数层（输出先右后左，存入栈中先左后右）
                ArrayList<Integer> list = new ArrayList<>();
                while (!s1.empty()) {
                    TreeNode node = s1.pop();
                    if (node!= null) {
                        list.add(node.data);
                        s2.push(node.left);//因为偶数层，先右后左，所以要先放左子树，栈
                        s2.push(node.right);

                    }
                }
                if (!list.isEmpty()) {
                    res.add(list);
                    level++;
                }
            }
            else {//偶数层，下一层为奇数层（输出先左后右，存入栈中先右后左）
                ArrayList<Integer> list = new ArrayList<>();
                while (!s2.empty()) {
                    TreeNode node = s2.pop();
                    if (node!= null) {
                        list.add(node.data);
                        s1.push(node.right);
                        s1.push(node.left);

                    }
                }
                if (!list.isEmpty()) {
                    res.add(list);
                    level++;
                }
            }
        }
        return res;
    }

    /**
     * 利用链表，偶数层反向输出
     */
    public static ArrayList<LinkedList<Integer> > PrintZ2(TreeNode pRoot) {
        ArrayList<LinkedList<Integer>> res = new ArrayList<>();
        if (pRoot==null)
            return res;
        int level=1;
        Queue<TreeNode> queue1 = new LinkedList<>(); //存储奇数层
        Queue<TreeNode> queue2 = new LinkedList<>(); //存储偶数层
        queue1.offer(pRoot);
        while (!queue1.isEmpty() || !queue2.isEmpty()){
            if (level%2 != 0){
                LinkedList<Integer> list = new LinkedList<>();
                while (!queue1.isEmpty()){
                    TreeNode node = queue1.poll();
                    if (node!=null){
                        list.add(node.data);
                        queue2.offer(node.left);
                        queue2.offer(node.right);
                    }
                }
                if (!list.isEmpty()){
                    res.add(list);
                    level++;
                }

            }else {
                //偶数层,下一层为奇数层
                LinkedList<Integer> list = new LinkedList<>();
                while (!queue2.isEmpty()){
                    TreeNode node = queue2.poll();
                    if (node!=null){
                        list.add(node.data);
                        queue1.offer(node.left);
                        queue1.offer(node.right);
                    }
                }
                if (!list.isEmpty()){
                    Iterator it=list.descendingIterator();
                    LinkedList<Integer> list2 = new LinkedList<>();
                    while (it.hasNext()){
                        list2.add((Integer) it.next());
                    }

                    res.add(list2);
                    level++;
                }
            }

        }
        return res;


    }



}
