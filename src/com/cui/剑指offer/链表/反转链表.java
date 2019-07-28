package com.cui.剑指offer.链表;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class 反转链表 {

    public static ListNode ReverseList(ListNode head) {
        if (head==null)
            return null;

        ListNode pre=null;
        ListNode next=null;
        while (head!=null){//注意这个地方的写法，如果写head.next将会丢失最后一个节点
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
