package com.cui.剑指offer.链表;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class 链表中倒数第k个节点 {

    public static ListNode FindKthToTail(ListNode head,int k) {
        /**
         * 正常的思路是，设置两个游标,让快的领先k个
         */

        ListNode slow = head;
        ListNode fast = head;
        if (head == null || k <= 0) {
            return null;
        }
        for (int i = 1; i < k; i++) { //快的先走k-1步,到达正数第k个，倒数第三个，其实应该快的指到第三个，只需要走两步即可。
            if(fast.next == null) //这个是k与链表长度的关系，如果，链表长度小于k，肯定在走到k之前就出现
                //null，直接返回null即可
                return null;
            else
                fast = fast.next;
        }
        while(fast.next != null){ //快的从第k个，慢的从第1个，同时开始走。当快的走到链表尾部时，慢的走到（length-k），即倒数第k个
            slow = slow.next;
            fast = fast.next;
        }
        return slow;


    }
}
