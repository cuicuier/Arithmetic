package com.cui.剑指offer.链表;


import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class 从尾到头打印链表 {

    /**
     * 将链表数据一次存入list，再反转list
     * @param listNode
     * @return
     */
    public static ArrayList<Integer> printFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
        while (listNode!=null){
            list.add(listNode.data);
            listNode=listNode.next;
        }
        Collections.reverse(list);
        return list;

    }
}
