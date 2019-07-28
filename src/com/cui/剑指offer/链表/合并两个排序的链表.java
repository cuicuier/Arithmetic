package com.cui.剑指offer.链表;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class 合并两个排序的链表 {

    public static ListNode merge(ListNode list1,ListNode list2) {
        if (list1==null)
            return list2;
        if (list2==null)
            return list1;

        ListNode head=null;

        if (list1.data<list2.data){
            head=list1;
            head.next=merge(list1.next,list2);
        }else {
            head=list2;
            head.next=merge(list1,list2.next);
        }
        return head;


    }
}
