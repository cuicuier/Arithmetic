package com.cui.剑指offer.链表;

import java.util.ArrayList;

import static com.cui.剑指offer.链表.从尾到头打印链表.printFromTailToHead;
import static com.cui.剑指offer.链表.反转链表.ReverseList;

public class Main {

    public static void main(String[] args) {
        ListNode n1=new ListNode(1,null);
        ListNode n2=new ListNode(3,n1);
        ListNode n3=new ListNode(2,n2);
        ListNode n4=new ListNode(6,n3);
        ArrayList<Integer> list=printFromTailToHead(n4);
        for (int i:list
             ) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println(ReverseList(n4).data);


    }
}
