package com.cui.leetcode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class 两数相加 {
    public static void main(String[] args) {
        ListNode n1=new ListNode(2);
        ListNode n2=new ListNode(4);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(5);
        ListNode n5=new ListNode(6);
        ListNode n6=new ListNode(4);
        ListNode n8=new ListNode(9);
        ListNode n9=new ListNode(9);
        ListNode n10=new ListNode(9);
        ListNode n11=new ListNode(9);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;



        System.out.println(addTwoNumbers(n1,n4).val);


    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode current=head;
        boolean flag=false;//标记是否进1
        while (l1!=null || l2!=null || flag){
            if (l1==null){
                l1=new ListNode(0);
            }
            if (l2==null){
                l2=new ListNode(0);
            }
            int sum=l1.val+l2.val;
            if (flag){//前一位的和满十，进1
                sum+=1;
            }
            if (sum>9)
                flag=true;
            else
                flag=false;
            ListNode next=new ListNode(sum%10);
            current.next=next;
            current=next;
            l1=l1.next;
            l2=l2.next;
        }
        return head.next;

    }

    
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int x) {
        val=x;
    }

}
